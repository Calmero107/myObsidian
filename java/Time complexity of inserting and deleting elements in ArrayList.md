
For insert:
- Head insertion: Since all elements need to be moved back one position in sequence, the time complexity is O(n).
- Tail insertion: `ArrayList`When the capacity of the list has not reached its limit, the time complexity of inserting an element to the end of the list is O(1), because it only needs to add one element to the end of the array; when the capacity has reached its limit and needs to be expanded, it is necessary to perform an O(n) operation to copy the original array to a new larger array, and then perform an O(1) operation to add elements.
- Insert at a specified position: All elements after the target position need to be moved one position backwards, and then the new element is placed at the specified position. This process requires moving an average of n/2 elements, so the time complexity is O(n).

For deletion:
- Head deletion: Since all elements need to be moved forward one position in sequence, the time complexity is O(n).
- Tail deletion: When the deleted element is at the end of the list, the time complexity is O(1).
- Deletion at a specified position: All elements after the target element need to be moved forward one position to fill the deleted blank position. Therefore, an average of n/2 elements need to be moved, and the time complexity is O(n).


![[Pasted image 20250113113513.png]]