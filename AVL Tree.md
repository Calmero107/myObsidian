
The AVL tree is the ==earliest self-balancing binary search tree== invented in computer science. Its name comes from the initials of its inventors, GM Adelson-Velsky and EM Landis. The AVL tree is characterized by ensuring that the height difference between the left and right subtrees of any node does not exceed 1, so it is also called a highly balanced binary tree. Its search, insertion, and deletion time complexity is O(logn) in both the average and worst cases.

![[Pasted image 20250116153959.png]]

AVL tree uses rotation operation to maintain balance. There are four main rotation operations: LL rotation, RR rotation, LR rotation and RL rotation. LL rotation and RR rotation are used to deal with left-left and right-right imbalance respectively, while LR rotation and RL rotation are used to deal with left-right and right-left imbalance.

Since the AVL tree needs to rotate frequently to maintain balance, there will be a large computational overhead, which reduces the performance of database write operations. In addition, when using the AVL tree, each tree node stores only one data, and each disk IO can only read the data of one node. If the data to be queried is distributed on multiple nodes, multiple disk IOs are required. **Disk IO is a time-consuming operation. When designing database indexes, we need to give priority to how to minimize the number of disk IO operations.**

==In practical applications, AVL trees are not used much.==
