
**The string constant pool** is an area specially opened up by the JVM for strings (String class) in order to improve performance and reduce memory consumption. The main purpose is to avoid repeated creation of strings.

ex: ==String s1 = new String("abc");==
1. If the string object "abc" does not exist in the string constant pool, it will first create a string object "abc" in the string constant pool, and then create another string object "abc" in the heap memory.
2. If the string object "abc" already exists in the string constant pool, only one string object "abc" will be created in the heap.