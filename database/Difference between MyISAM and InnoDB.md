
- **row-level locks**
	MyISAM ==only has table-level locking==, while InnoDB supports ==row-level locking and table-level locking==, with row-level locking being the default.
	In other words, MyISAM locks the entire table once it is locked, which is very stupid in the case of concurrent writes! This is also why ==InnoDB has better performance when writing concurrently!==

- **support transactions**
	==MyISAM does not provide transaction support.==
	InnoDB provides transaction support, implements the four isolation levels defined by the SQL standard, and has the ability to commit and rollback transactions. In addition, the REPEATABLE-READ [[MySQL transaction isolation level]] used by InnoDB by default can solve the phantom read problem (based on MVCC and Next-Key Lock).

- **support foreign keys**
	==MyISAM does not support it, but InnoDB does.==
	Foreign keys are very helpful for maintaining data consistency, but they have a certain impact on performance. Therefore, under normal circumstances, we do not recommend using foreign keys in actual production projects. You can just constrain them in the business code!

	Generally, we do not recommend using foreign keys at the database level, but this can be solved at the application level. However, this will threaten the consistency of the data. Whether to use foreign keys depends on your project.

- **support safe recovery after abnormal database crash**
	==MyISAM does not support it, but InnoDB does.==
	When a database using InnoDB crashes abnormally, it will be guaranteed to be restored to the state before the crash when the database is restarted. This recovery process ==depends on `redo log`.==

- **MVCC**
	==MyISAM does not support it, but InnoDB does.==
	MyISAM does not even support row-level locks. MVCC can be seen as an upgrade of row-level locks, which can effectively reduce locking operations and improve performance.

- **Index implementation.**
	Although both the ==MyISAM engine and the InnoDB engine use B+Tree== as the index structure, their ==implementation methods are slightly different==.
	In the InnoDB engine, ==its data file itself is an index file==. Compared with MyISAM, the index file and data file are separated, and its table data file itself is an index structure organized by B+Tree, and the leaf node data field of the tree stores complete data records.

- **differences in performance.**
	==InnoDB has more powerful performance than MyISAM==. Whether in read-write mixed mode or read-only mode, InnoDB's read-write capability increases linearly with the increase of CPU cores. Because MyISAM cannot read and write concurrently, its processing power has nothing to do with the number of cores.
	![[Pasted image 20250115142117.png]]

- **Data caching strategies and mechanisms are implemented differently.**
	InnoDB uses the buffer pool to cache data pages and index pages, and MyISAM uses the key cache to cache only index pages but not data pages.