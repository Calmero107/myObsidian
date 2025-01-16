
![[Pasted image 20250115102550.png]]

- First check whether the statement has ==permission==. If not, an error message is returned directly. If permission is granted, before MySQL 8.0, the cache will be queried first, using this SQL statement as the key to check whether there is a result in memory. If so, cache it directly. If not, proceed to the next step.

- The ==analyzer performs lexical== analysis to extract the key elements of the SQL statement. For example, the statement above is a select query, the table name to be queried is tb_student, all columns need to be queried, and the query condition is id='1' of this table. Then determine whether the SQL statement has syntax errors, such as whether the keywords are correct, etc. If the check is OK, proceed to the next step.

- Next, the ==optimizer determines the execution plan==. The above SQL statement can be executed in two ways: a. First query the student named "Zhang San" in the student table, and then determine whether the age is 18. b. First find the students who are 18 years old, and then query the students named "Zhang San". Then the optimizer selects the plan with the best execution efficiency according to its own optimization algorithm (the optimizer believes that sometimes it may not be the best). After confirming the execution plan, it is ready to start execution.

- ==Perform permission check==. If there is no permission, an error message will be returned. If there is permission, the database engine interface will be called and the engine's execution result will be returned.
