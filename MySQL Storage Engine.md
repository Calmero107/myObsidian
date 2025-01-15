
==The core of MySQL lies in the storage engine. If you want to learn MySQL in depth, you must study the MySQL storage engine in depth.==
![[Pasted image 20250115111152.png]]

From the above figure, we can see that the current default storage engine of MySQL is InnoDB. Moreover, among all storage engines, only InnoDB is a transactional storage engine, which means that ==only InnoDB supports transactions.==

Before MySQL 5.5.5, MyISAM was the default storage engine for MySQL. After 5.5.5, InnoDB is the default storage engine for MySQL.

Do you understand the [[MySQL storage engine architecture]]?