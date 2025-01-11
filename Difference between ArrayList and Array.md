
`ArrayList`Internally, it is implemented based on a dynamic array, which `Array`is more flexible to use than a static array:
- `ArrayList`It will ==dynamically expand or shrink== according to the actual elements stored, and `Array`its length cannot be changed after it is created.
- `ArrayList`Allowing you to ==use generics to ensure type safety==, `Array`you can't.
- `ArrayList`==Only objects can be stored in it==. For basic type data, you need to use its corresponding wrapper class (such as Integer, Double, etc.). `Array`You can directly store basic type data or objects.
- `ArrayList`It supports common operations such as insertion, deletion, and traversal, and provides a wealth of API operation methods, such as `add()`, `remove()`etc. ==`Array`It is just an array of fixed length==, and the elements in it can only be accessed according to the subscript, and it does not have the ability to dynamically add or delete elements.
- `ArrayList`==The size does not need to be specified when creating==, but `Array`the size must be specified when creating.

---

著作权归JavaGuide(javaguide.cn)所有 基于MIT协议 原文链接：https://javaguide.cn/java/collection/java-collection-questions-01.html

---

著作权归JavaGuide(javaguide.cn)所有 基于MIT协议 原文链接：https://javaguide.cn/java/collection/java-collection-questions-01.html



---

著作权归JavaGuide(javaguide.cn)所有 基于MIT协议 原文链接：https://javaguide.cn/java/collection/java-collection-questions-01.html