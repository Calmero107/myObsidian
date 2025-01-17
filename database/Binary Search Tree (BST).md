
Binary Search Tree is a data structure based on binary tree, which has the following characteristics:
- The values ​​of all nodes in the left subtree are less than the value of the root node.
- The values ​​of all nodes in the right subtree are greater than the value of the root node.
- The left and right subtrees are also binary search trees.

[[AVL Tree]]

[[Red-Black Tree]]

[[B-Tree and B plus Tree]]

When the ==binary search tree is balanced==, that is, when the depth difference between the left and right subtrees of each node in the tree does not exceed 1, the query time complexity is ==O(log2(N)),== which is relatively efficient. However, when the binary search tree is ==unbalanced==, such as in the worst case (ordered insertion of nodes), the tree will degenerate into a linear linked list (also known as a skew tree), resulting in a sharp drop in query efficiency and a ==time complexity of O(N)==.
![[Pasted image 20250116153239.png]]
In other words, **the performance of a binary search tree is highly dependent on its degree of balance, which makes it unsuitable as the data structure for the underlying index of MySQL.**

In order to solve this problem and improve query efficiency, people have invented a variety of improved data structures based on binary search trees, such as balanced binary trees, B-Trees, B+Trees, etc.
