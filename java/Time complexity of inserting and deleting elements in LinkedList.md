
Head insertion/deletion: You only need to modify the pointer of the head node to complete the insertion/deletion operation, so the time complexity is O(1).

Tail insertion/deletion: You only need to modify the pointer of the tail node to complete the insertion/deletion operation, so the time complexity is O(1).

Insertion/deletion at a specified position: You need to move to the specified position first, and then modify the pointer of the specified node to complete the insertion/deletion. However, since there are head and tail pointers, you can start from the closer pointer, so you need to traverse an average of n/4 elements, and the time complexity is O(n).

![[Pasted image 20250113113612.png]]