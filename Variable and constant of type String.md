
![[Pasted image 20241223112035.png]]

`String str3 = "str" + "ing";`
The compiler will optimize it for you `String str3 = "string";`.
The value of the reference cannot be determined during program compilation, and the compiler cannot optimize it.

Not all constants are folded, only those constants whose values ​​can be determined by the compiler at compile time:

- Basic data types ( `byte`, `boolean`, `short`, `char`, `int`, `float`, `long`, `double`) and string constants.
- `final`Modified basic data types and string variables
- Strings obtained by concatenating strings with "+", arithmetic operations (addition, subtraction, multiplication and division) between basic data types, and bitwise operations of basic data types (<<, >>, >>>)
	![[Pasted image 20241223114637.png]]