
**Divided by data structure dimension:**
- **BTree index**: The default and most commonly used index type in MySQL. Only leaf nodes store values, and non-leaf nodes only have pointers and keys. Storage engines MyISAM and InnoDB both use B+Tree to implement BTree indexes, but the implementation methods are different (as described above).
- **Hash index**: Similar to a key-value pair, it can be located once.
- **RTree index**: Generally not used, only supports geometry data type, the advantage is range search, low efficiency, usually use search engines such as ElasticSearch instead.
- **Full-text index:** Segment the text content and search it. Currently, only `CHAR`, `VARCHAR`, and `TEXT`columns can create full-text indexes. It is generally not used and is inefficient. Search engines such as ElasticSearch are usually used instead.

**Divided by the underlying storage method:**
- Clustered index (clustered index): An index in which the index structure and data are stored together. The primary key index in InnoDB is a clustered index.
- Non-clustered index (non-clustered index): An index in which the index structure and data are stored separately. Secondary indexes (auxiliary indexes) belong to non-clustered indexes. MySQL's MyISAM engine uses non-clustered indexes regardless of whether it is a primary key or a non-primary key.

**Divided by application dimension:**
- [[Primary key index]]: speeds up query + column value is unique (cannot have NULL) + there is only one in the table.
- Normal index: only speeds up queries.
- Unique index: speeds up query + column value is unique (can have NULL).- Covering index: An index contains (or covers) the values ​​of all fields that need to be queried.
- Joint index: Multiple column values ​​form an index specifically for combined search, which is more efficient than index merging.
- Full-text index: Segment the text content and search it. Currently, only `CHAR`, `VARCHAR`, and `TEXT`columns can create full-text indexes. It is generally not used and is inefficient. Search engines such as ElasticSearch are usually used instead.
- Prefix index: Create an index for the first few characters of the text. The data created is smaller than that created by a normal index because only the first few characters are taken.

**New index features implemented in MySQL 8.x:**
- Hidden index: Also known as invisible index, it is not used by the optimizer, but still needs to be maintained. It is usually used in soft deletion and grayscale release scenarios. The primary key cannot be set to hidden (including explicit settings or implicit settings).
- Descending index: Previous versions supported specifying the index as descending by using desc, but in fact the created index was still a regular ascending index. It was not until MySQL 8.x that descending indexes were truly supported. In addition, in MySQL 8.x, the GROUP BY statement is no longer implicitly sorted.
- Function index: Starting from MySQL 8.0.13, it supports using function or expression values ​​in indexes, that is, functions or expressions can be included in indexes.
