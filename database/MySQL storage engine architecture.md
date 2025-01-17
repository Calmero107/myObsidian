
The MySQL storage engine uses **a plug-in architecture** and supports multiple storage engines. We can even set different storage engines for different database tables to meet the needs of different scenarios. **The storage engine is based on tables, not databases.**

What is the [[Difference between MyISAM and InnoDB]]?

[[How to choose between MyISAM and InnoDB]]?

![[Pasted image 20250115113023.png]]

You ==can also write your own storage engine based on the storage engine standard interface== defined by MySQL. These unofficial storage engines can be called third-party storage engines, which are different from official storage engines. For example, the most commonly used InnoDB was actually a third-party storage engine at the beginning. Later, it was directly acquired by Oracle because it was too excellent.


**Compares several common MySQL storage engines in detail.**
![[Pasted image 20250115142316.png]]

