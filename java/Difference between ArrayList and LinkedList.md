
**Is thread safety guaranteed?** `ArrayList` Both `LinkedList`are not synchronized, which means thread safety is ==not guaranteed.==

**Underlying data structure: The** `ArrayList` underlying data structure is ==**`Object`an array**== ; `LinkedList`the underlying data structure is ==**a doubly linked list**== (before JDK1.6, it was a circular linked list, and JDK1.7 canceled the loop. Note the difference between a doubly linked list and a doubly circular linked list, which is introduced below!)

**Whether insertion and deletion are affected by the position of the element**

**Whether to support fast random access:** ==`LinkedList` It does not support== efficient random element access, but `==ArrayList==`(implements `RandomAccess`the interface) ==supports it==. Fast random access is to quickly obtain element objects (corresponding to `get(int index)`methods) through the element serial number.

**Memory space usage:** `ArrayList` The space waste is mainly reflected in the fact that a certain amount of capacity space will be reserved at the end of the list, while the space cost of LinkedList is reflected in the fact that each of its elements requires more space than ArrayList (because it needs to store the direct successor and direct predecessor as well as data).

We generally don't use in our projects `LinkedList`. `LinkedList`Almost all scenarios where can be used can be `ArrayList`replaced by , and the performance is usually better! Even `LinkedList`Josh Bloch, the author of , said that he never uses it `LinkedList`.

[[Doubly linked list and bidirectional circular linked list]]