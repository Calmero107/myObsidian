 **Calling method**: Static methods can be called without creating an object .

**Are there any restrictions on accessing class members?**

**Overload**
Occurs in the same class (or between a parent class and a child class), the method name must be the same, the parameter types, numbers, and orders are different, and the method return values ​​and access modifiers can be different.
The compiler must choose which method to execute, and it does this by matching the parameter types given to each method with the value types used in the particular method call. ==A compile-time== error occurs if the compiler cannot find a matching parameter

**Overriding** 
overriding is the reshaping of the parent class method by the subclass. The external appearance cannot be changed, but the internal logic can be changed.

Occurs at runtime, and is the process of a subclass rewriting the implementation of a method that is allowed to be accessed by the parent class.
1. The method name and parameter list must be the same. The return value type of the subclass method should be smaller or equal to the return value type of the parent class method. The range of the thrown exception is less than or equal to the parent class, and the access modifier range is greater than or equal to the parent class.
2. If the parent class method access modifier is , `private/final/static`the subclass cannot override the method, but `static`the modified method can be declared again.
3. Constructors cannot be overridden

![[Pasted image 20241204181332.png]]

**Method rewriting (overriding) should follow the "two same, two small, one large" rule**
- "Two same" means the method name is the same and the parameter list is the same;
- "Two small" means that the return value type of the subclass method should be smaller or equal to the return value type of the parent class method, and the exception class declared thrown by the subclass method should be smaller or equal to the exception class declared thrown by the parent class method;
- "A large" means that the access rights of the subclass method should be greater than or equal to those of the parent class method.