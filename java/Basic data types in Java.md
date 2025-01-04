There are 8 basic data types in Java, namely:

- 6 number types:
    - 4 integer types: `byte`, `short`, `int`,`long`
    - 2 floating point types: `float`,`double`
- 1 character type:`char`
- 1 Boolean type: `boolean`.

	![[Pasted image 20241220152158.png]]

The maximum positive numbers that can be represented by `byte`, `short`, `int`, and `long`are all minus 1. This is because in the two's complement representation, the highest bit is used to represent the sign (0 for positive numbers, 1 for negative numbers), and the remaining bits represent the numerical part. Therefore, if we want to represent the largest positive number, we need to set all bits except the highest bit to 1. If we add 1, it will cause an overflow and become a negative number.

![[Pasted image 20241220153141.png]]

`char a = 'h'`char :single quote, `String a = "hello"`:double quote.