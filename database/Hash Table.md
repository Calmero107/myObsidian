
A hash table is a collection of key-value pairs. The corresponding value can be quickly retrieved through the key, so the hash table can quickly retrieve data (close to O(1)).

**Why can we quickly retrieve the value through the key?** The reason is **the hash algorithm** (also called hash algorithm). Through the hash algorithm, we can quickly find the index corresponding to the key, and when we find the index, we can also find the corresponding value.

However! The hash algorithm has a **hash collision** problem, which means that multiple different keys end up with the same index.

![[Pasted image 20250116110532.png]]
![[Pasted image 20250116110617.png]]