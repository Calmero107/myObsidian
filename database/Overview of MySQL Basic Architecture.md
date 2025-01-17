
![[Pasted image 20250114173859.png]]
![[Pasted image 20250114175030.png]]

- **[[Connector]]:** Authentication and permissions related (when logging into MySQL).
- **[[Query cache (removed after MySQL 8.0)]]:** When executing a query statement, the cache will be queried first (removed after MySQL 8.0 because this feature is not very practical).
- **[[Analyzer]]:** If there is no cache hit, the SQL statement will go through the analyzer. To put it simply, the analyzer will first look at what your SQL statement is doing, and then check whether your SQL statement syntax is correct.
- **[[Optimizer]]:** Execute according to the solution that MySQL considers to be the best.
- **[[Executor]]:** Executes statements and returns data from the storage engine.

Simply put, MySQL is mainly divided into the server layer and the storage engine layer:
- **Server layer** : mainly includes connectors, query cache, analyzer, optimizer, executor, etc. All cross-storage engine functions are implemented in this layer, such as stored procedures, triggers, views, functions, etc. There is also a general log module binlog log module.
- **Storage engine** : mainly responsible for data storage and reading, adopts replaceable plug-in architecture, supports multiple storage engines such as InnoDB, MyISAM, Memory, etc., among which InnoDB engine has its own log module redolog module. **The most commonly used storage engine now is InnoDB, which has been used as the default storage engine since MySQL version 5.5.**