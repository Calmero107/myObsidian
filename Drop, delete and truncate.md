
Different usage:
- `drop`(Discard data): `drop table a`, directly delete all tables, used when deleting tables.
- `truncate`(Clear data): `truncate table a`Only delete the data in the table. When inserting data again, the self-increment id will start from 1 again. It is used when clearing the data in the table.
- `delete`(Delete data): `delete from a where name=b`Delete a row of data. If no `where`clause is added, `truncate table a`the effect is similar.

`truncate`and without `where`the clause `delete`, and `drop`will delete the data in the table, but **`truncate`and `delete`only delete the data but not the structure (definition) of the table. When the statement is executed , the structure of the table will also be deleted, that is, the corresponding table will no longer exist after `drop`executing .


**Belong to different database languages**
`truncate`and `drop`belong to DDL (data definition language) statements. The operation takes effect immediately. The original data is not placed in the rollback segment and cannot be rolled back. The operation does not trigger a trigger. `delete`The statement is a DML (database manipulation language) statement. This operation will be placed in the rollback segment and will take effect only after the transaction is committed.

**The difference between [[DML statements and DDL statements]]?

Different execution speeds:
Generally speaking: `drop`> `truncate`> `delete` (I haven't actually tested this).
- `delete`When the command is executed, a database `binlog`log will be generated. Although logging takes time, it also has the advantage of facilitating data rollback and recovery.
- `truncate`No database log is generated when the command is executed, so it is `delete`faster than . In addition, the table's auto-increment value and index are reset to their initial size.
- `drop`The command will release all the space occupied by the table.

Tips: You should focus more on usage scenarios rather than execution efficiency.