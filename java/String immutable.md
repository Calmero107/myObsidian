
- The array holding the string is `final`modified and private, and `String`the class does not provide/expose methods to modify the string.
- The class `String` is `final`modified so that it cannot be inherited, thus preventing subclasses from destroying `String` immutability.

**Why did Java 9 change `String`the underlying implementation of from `char[]`to `byte[]`?**
Because most usages of Strings are Latin-1 and only require one byte, Java-9's String will be updated to be implemented under the hood as a byte array with an encoding flag field to note if it is a byte array. If the characters are not Latin-1 and require more than one byte it will be stored as a UTF-16 char array (2 bytes per char) and the flag.
