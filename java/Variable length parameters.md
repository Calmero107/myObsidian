Since Java 5, Java supports the definition of variable-length parameters, which means that parameters of indefinite length can be passed in when calling a method.

in addition, a variable parameter can only be the last parameter of a function, but it may or may not be preceded by any other parameters.

**What should we do when we encounter method overloading? Will the method with fixed parameters or variable parameters be matched first?**

The answer is that the method with fixed parameters will be matched first because the matching degree of the method with fixed parameters is higher.

![[Pasted image 20241204182021.png]]