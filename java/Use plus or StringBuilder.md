
the string object is concatenated by the "+" string, which is actually implemented by `StringBuilder`calling the method `append()`. After the concatenation is completed, call to `toString()` get an `String` object.

However, if you use "+" to concatenate strings in a loop, there is an obvious flaw: **the compiler will not create a single `StringBuilder`for reuse, which will result in the creation of too many `StringBuilder`objects** .
![[Pasted image 20241223105910.png]]
The object `StringBuilder` is created inside the loop, which means that one `StringBuilder`object is created each time the loop is passed.