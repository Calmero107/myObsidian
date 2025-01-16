
This is because MySQL did not have the InnoDB engine at the beginning (the InnoDB engine was inserted into MySQL by other companies as a plug-in). The engine that comes with MySQL is MyISAM, but we know that ==redo log is unique to the InnoDB engine and other storage engines do not have it==. This results in the lack of crash-safe capability (the crash-safe capability means that even if the database restarts abnormally, previously submitted records will not be lost), and binlog logs can only be used for archiving.

It is not that it is not possible to use only one log module, but the InnoDB engine supports transactions through redo log. Then, some students may ask, can I use two log modules, but not so complicated? Why does redo log introduce prepare ==pre-commit state==? Here we use the method of contradiction to explain why we do this?
- **First write the redo log and submit it directly, then write the binlog** . Suppose after writing the redo log, the machine crashes and the binlog is not written. After the machine restarts, the machine will restore the data through the redo log. However, the binlog does not record the data at this time. When the machine is backed up later, this piece of data will be lost. At the same time, ==the master-slave synchronization will also lose this piece of data.==
- **Write binlog first, then write redo log** . Suppose after writing binlog, the machine restarts abnormally. Since there is no redo log, the machine cannot recover this record. However, binlog has another record. Then, ==the same reason as above will cause data inconsistency.==

If the redo log two-stage commit method is adopted, the above problems will be avoided after writing binlog and then submitting the redo log, thus ensuring data consistency. Then the question is, is there an extreme case? Assuming that the redo log is in the pre-commit state and the binlog has been written, what will happen if an abnormal restart occurs at this time?
This depends on the processing mechanism of MySQL. The processing process of MySQL is as follows:
- ==Determine whether the redo log is complete. If it is complete, commit it immediately.==
- ==If the redo log is in the pre-committed but not committed state, the transaction will be rolled back if the binlog is complete.==
This solves the problem of data consistency.
