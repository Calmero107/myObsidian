
A Hash Collision **occurs in a hash table when two different strings produce the same hash value, leading to a conflict in indexing**

*The hash algorithm has a **hash collision** problem, which means that multiple different keys end up with the same index. Usually, the solution we often use is **the chain address method** . The chain address method is to store the hash collision data in a linked list. For example, before JDK1.8, `HashMap`the chain address method was used to solve hash collisions. However, after JDK1.8, `HashMap`red-black trees were introduced to reduce the search time when the linked list is too long.*

This can be resolved by using a well-designed hash function that minimizes the chances of collisions. AI generated definition based on: Engineering a Compiler (Third Edition), 2023.

![[Pasted image 20250116105253.png]]

![[Pasted image 20250116105410.png]]