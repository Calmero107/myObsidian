
`NULL`and `''`(empty string) are two completely different values, the difference is as follows:

- **Meaning:** NULL represents an uncertain or unknown value. Even two NULLs are not necessarily equal. For example, `SELECT NULL=NULL` returns false. However, when using `DISTINCT`, `GROUP BY`, or `ORDER BY`, NULLs are treated as equal. On the other hand, '' has a length of 0 and represents an empty string.
- **Storage Space:** '' (empty string) does not occupy storage space, while NULL requires storage space.
- **Impact on Aggregate Functions:** NULL affects the results of aggregate functions. For example, aggregate functions like `SUM`, `AVG`, `MIN`, and `MAX` ignore NULL values. `COUNT` handles NULLs differently depending on the parameter:
	- `COUNT(*)` counts all records, including those with NULL values.
	- `COUNT(column_name)` ignores NULL values and only counts non-NULL values.
- **Comparison Operators:** When querying for NULL values, you must use `IS NULL` or `IS NOT NULL`. You cannot use comparison operators like `=`, `!=`, `<`, or `>`. In contrast, '' can be used with these comparison operators.