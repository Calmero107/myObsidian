
B-tree is also called B-tree, and its full name is **multi-way balanced search tree** . ==B+ tree is a variant of B-tree==. The B in B-tree and B+ tree `Balanced`means (balanced).

Currently, ==most database systems and file systems use B-Tree or its variant B+Tree as index structure.==

**What are the similarities and differences between B-tree and B+tree?**
- ==All nodes of the B-tree store both keys and data==, while only leaf nodes of the B+ tree store keys and data, and other internal nodes only store keys.
- The ==leaf nodes of a B-tree are independent==; the leaf nodes of a B+ tree have a reference chain pointing to the adjacent (liền kề) leaf nodes.
- The search process of the ==B-tree== is equivalent to a binary search of the keywords of each node in the range. The ==search may end before reaching the leaf node==. The search efficiency of the ==B+ tree== is very stable. ==Any search is a process from the root node to the leaf node==. The sequential search of the leaf node is very obvious.
- When performing a range query in a B-tree, first find the lower limit to be searched, then perform an in-order traversal of the B-tree until the upper limit to be searched is found; while for a range query in a B+ tree, only the linked list needs to be traversed.
![[Pasted image 20250116170723.png]]

In summary, compared with B-tree, ==B+ tree has the advantages of less IO times, more stable query efficiency and is more suitable for range query.==

In MySQL, both MyISAM and InnoDB engines use B+Tree as the index structure, but the implementation methods are different. (The following content is compiled from "Java Engineer Cultivation Path")
	In the MyISAM engine, the data field of the B+Tree leaf node stores the address of the data record. When searching the index, the index is first searched according to the B+Tree search algorithm. If the specified key exists, the value of its data field is taken out, and then the corresponding data record is read with the value of the data field as the address. This is called a " **non-clustered index (non-clustered index)** ".
	In the InnoDB engine, its data file itself is an index file. Compared with MyISAM, the index file and data file are separated, and its table data file itself is an index structure organized by B+Tree, and the leaf node data field of the tree stores complete data records. The key of this index is the primary key of the data table, so the InnoDB table data file itself is the primary index. This is called a " **clustered index (clustered index)** ", and the rest of the indexes are used as **auxiliary indexes** . The data field of the auxiliary index stores the value of the primary key of the corresponding record instead of the address, which is also different from MyISAM.
	When searching according to the primary index, you can directly find the node where the key is located to retrieve the data; when searching according to the auxiliary index, you need to first retrieve the value of the primary key and then go through the primary index. Therefore, when designing a table, it is not recommended to use a field that is too long as the primary key, nor is it recommended to use a non-monotonic field as the primary key, which will cause the primary index to split frequently.

