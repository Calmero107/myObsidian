
![[Pasted image 20250115102648.png]]
Let's modify Zhang San's age. In the actual database, the age field will definitely not be set, otherwise the technical director will be punished. In fact, this statement will basically ==follow the process of the previous query==, ==but when executing the update, it must record the log==, which will introduce the log module. The log module that comes with MySQL is **binlog (archive log)** , which can be used by all storage engines. Our commonly used InnoDB engine also comes with a log module **redo log (redo log)** . Let's discuss the execution process of this statement in InnoDB mode. The process is as follows:
- The data of Zhang San is queried first, and ==the query cache will not be used== because the update statement will cause the query cache related to the table to become invalid.
- Then get the query statement, change age to 19, and call the engine API interface to write this row of data. The InnoDB engine saves the data in memory and records the redo log. At this time, the redo log enters the prepare state and tells the executor that the execution is complete and can be submitted at any time.
- After receiving the notification, the executor records the binlog, then calls the engine interface to submit the redo log to the committed state.
- Update completed.

**Some students will definitely ask [[why we need two log modules]]. Can't we use one log module?**