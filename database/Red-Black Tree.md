
The red-black tree is a self-balancing binary search tree. By performing color changes and rotation operations when inserting and deleting nodes, the tree is always kept in a balanced state. It has the following characteristics:
- Each node is either red or black;
- The root node is always black;
- Each leaf node is a black empty node (NIL node);
- If a node is red, its children must be black (but not necessarily vice versa);
- Every path from any node to its leaf nodes or empty child nodes must contain the same number of black nodes (i.e. the same black height).

![[Pasted image 20250116162317.png]]

Unlike AVL trees, red-black trees do not pursue strict balance, but rather a rough balance. Because of this, the query efficiency of red-black trees is slightly reduced, because the red-black tree is ==relatively weak in balance==, which may result in a high tree height, which may cause some data to ==require multiple disk IO operations to query==, which is also the main reason why ==MySQL did not choose red-black trees==. Because of this, the efficiency of ==insertion and deletion operations of red-black trees is greatly improved==, because red-black trees only need to perform O(1) rotation and color change operations when inserting and deleting nodes to maintain a basic balance state, without the need for O(logn) rotation operations like AVL trees.

**The application of red-black trees is still quite extensive. TreeMap, TreeSet and the underlying HashMap of JDK1.8 all use red-black trees. For the case where data is in memory, the performance of red-black trees is very excellent.**
