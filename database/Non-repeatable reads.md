
Non-repeatable reads occur when a transaction ==reads a row twice but gets different values in each read==. This can happen when another transaction modifies the row in between the two reads.

Suppose we have a table named "employees" with the following columns: "id", "name", "salary", and "department". Transaction A executes the following query:
![[Pasted image 20250115145153.png]]

Meanwhile, Transaction B updates the salary of employee with id 1 using the following query:
![[Pasted image 20250115145252.png]]

If we are using Read Committed isolation level, Transaction A will not see the new value of the salary column until Transaction B commits. However, if we use Repeatable Read isolation level, Transaction A may see the new value of the salary column on its subsequent reads.