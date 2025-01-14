
Dirty reads occur when a transaction ==reads data that has been modified by another transaction but not yet committed==. This means that the transaction is reading data that is still in an intermediate or "dirty" state, and it may be rolled back later.

**Example:**
Suppose we have a table named "employees" with the following columns: "id", "name", "salary", and "department". Transaction A executes the following query:
![[Pasted image 20250115144756.png]]

Meanwhile, Transaction B updates the salary of employee with id 1 using the following query:
![[Pasted image 20250115144830.png]]

However, Transaction B does not commit the update yet. I==f we are using Read Uncommitted isolation level, Transaction A can read the new value of the salary column even though Transaction B has not committed the update yet.==