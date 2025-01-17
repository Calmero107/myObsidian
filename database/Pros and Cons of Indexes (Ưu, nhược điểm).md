
**advantage**:
- Using indexes can greatly ==speed up data retrieval== (greatly reduce the amount of data retrieved) and reduce IO times, which is also the main reason for creating indexes.
- By creating a unique index, you can ensure the uniqueness of each row of data in the database table.

**shortcoming** :
- ==Creating and maintaining indexes takes a lot of time==. When adding, deleting, or modifying data in a table, if the data has an index, the index also needs to be modified dynamically, which reduces SQL execution efficiency.
- Indexes need to be stored in physical files, which also ==consumes a certain amount of space.==

However, **does using indexes necessarily improve query performance?**
In most cases, index queries are faster than full table scans. However, if the database has a small amount of data, using an index may not necessarily bring much improvement.