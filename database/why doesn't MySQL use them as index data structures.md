
MySQL's InnoDB storage engine does not directly support conventional hash indexes. However, there is a special "Adaptive Hash Index" in the InnoDB storage engine. The adaptive hash index is not a pure hash index in the traditional sense, but combines the characteristics of B+Tree and hash index to better adapt to the data access mode and performance requirements in actual applications. Each hash bucket of the adaptive hash index is actually a small B+Tree structure. This B+Tree structure can store multiple key-value pairs, not just one key. This helps to reduce the length of the hash conflict chain and improve the efficiency of the index.

Mainly because hash indexes ==do not support sequential and range queries==. If we want to ==sort the data in the table or perform range queries, hash indexes will not work==. In addition, only one IO can be retrieved at a time.

![[Pasted image 20250116113013.png]]

In this range query, the advantage is very great. It is enough to directly traverse the leaf nodes smaller than 500. Hash index is located according to the hash algorithm. Do we need to perform a hash calculation on each data from 1 to 499 to locate it? This is the biggest disadvantage of Hash.

