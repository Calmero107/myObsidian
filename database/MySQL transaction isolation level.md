
The SQL standard defines four isolation levels:
- **READ-UNCOMMITTED** : The lowest isolation level that allows reading of data changes that have not yet been committed, which may result in [[Dirty reads]], [[Phantom reads]], or [[Non-repeatable reads]].
- **READ-COMMITTED** : Allows reading of data that has been committed by concurrent transactions, which can prevent dirty reads, but phantom reads or non-repeatable reads may still occur.
- **REPEATABLE-READ** : The results of multiple reads of the same field are consistent, unless the data is modified by the transaction itself. Dirty reads and non-repeatable reads can be prevented, but phantom reads may still occur.
- **SERIALIZABLE** : The highest isolation level, fully compliant with ACID isolation levels. All transactions are executed one by one, so that there is no possibility of interference between transactions. In other words, this level can prevent dirty reads, non-repeatable reads, and phantom reads.

![[Pasted image 20250115143142.png]]

==The default isolation level supported by the MySQL InnoDB storage engine is **REPEATABLE-READ

We can `SELECT @@tx_isolation;`view this through the command. In MySQL 8.0, this command is changed to`SELECT @@transaction_isolation;`
![[Pasted image 20250115143247.png]]

REPEATABLE-READ (repeatable read) cannot prevent phantom reads.
However! The REPEATABLE-READ isolation level implemented by InnoDB can actually solve the phantom read problem, mainly in the following two situations:
- **Snapshot read** : The MVCC mechanism ensures that no phantom read occurs.
- **Current Read** : Use Next-Key Lock to lock to prevent phantom reads. Next-Key Lock is a combination of Record Lock and Gap Lock. Record Lock can only lock existing rows. In order to avoid inserting new rows, Gap Lock is required.

Because the lower the isolation level, the fewer locks a transaction requests, the isolation level of most database systems is **READ-COMMITTED** . However, you should know that the InnoDB storage engine uses **REPEATABLE-READ** by default without any performance loss.

The InnoDB storage engine generally uses the SERIALIZABLE isolation level in distributed transactions.
