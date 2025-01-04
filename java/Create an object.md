
New operator, new creates an object instance (the object instance is in the heap memory), and the object reference points to the object instance (the object reference is stored in the stack memory).

- An object reference can point to 0 or 1 object (a string can be tied to no balloon or one balloon);
- An object can have n references pointing to it (a balloon can be tied with n strings).


The difference between object equality and reference equality

- The equality of objects generally compares whether the contents stored in memory are equal.
- Reference equality generally compares whether the memory addresses they point to are equal.