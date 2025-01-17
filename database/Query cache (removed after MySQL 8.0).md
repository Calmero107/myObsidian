
The query cache is mainly used to cache the SELECT statement we executed and the result set of the statement.

After the connection is established, when executing a query statement, the cache will be queried first. MySQL will first verify whether the SQL has been executed and cache it in the form of Key-Value in the memory. The Key is the query statement and the Value is the result set. If the cache key is hit, it will be returned directly to the client. If it is not hit, the subsequent operations will be executed. After completion, the results will also be cached for the next call. Of course, when the cache query is actually executed, the user's permissions will still be verified to see if there are query conditions for the table.

It is not recommended to use cache for MySQL queries, because query cache failure may be very frequent in actual business scenarios. ==If you update a table, all query caches on this table will be cleared. For data that is not updated frequently, it is still possible to use cache.==

Therefore, in most cases we do ==not recommend using query cache.==

The cache function was deleted after MySQL version 8.0. The official also believed that this function had few actual application scenarios, so it was simply deleted.
