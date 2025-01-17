
Phantom reads refer to the situation where a transaction ==reads a set of rows that satisfy a certain condition,== but when the same transaction repeats the same read operation later, ==additional rows appear that were not visible before==. This happens when ==another transaction commits a new row that satisfies the same conditio==n.

Suppose we have a table named "employees" with the following columns: "id", "name", "salary", and "department". Let's say Transaction A executes the following query:
![[Pasted image 20250115155520.png]]

Meanwhile, Transaction B inserts a new row into the employees table with department 'Sales' using the following query:
![[Pasted image 20250115155542.png]]

If we are using Read Committed isolation level, Transaction A will not see the new row inserted by Transaction B until Transaction B commits. However, if we use Repeatable Read isolation level, Transaction A may see the new row inserted by Transaction B on its subsequent reads.