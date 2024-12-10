
What is reflection?
Reflection is called the soul of the framework mainly because it gives us the ability to analyze classes and execute methods in classes at runtime.
==Through reflection you can get all the properties and methods of any class==, and you can also call these methods and properties.


**Do you understand the application scenarios of reflection?**

Because of reflection that you can ==use various frameworks== so easily. Reflection mechanisms are widely used in frameworks such as Spring/Spring Boot and MyBatis.

These frameworks also make extensive use of dynamic proxies, and the implementation of dynamic proxies also relies on reflection.

In addition, reflection is also used in the implementation of ==**annotations==,** a powerful tool in Java .


**Talk about the advantages and disadvantages of the reflection mechanism**

**Advantages** : It can make our code more flexible and provide convenience for various frameworks to provide out-of-the-box functions
**Disadvantages** : It allows us to analyze and manipulate classes at runtime, but it also increases security issues. For example, it can ignore the security check of generic parameters (the security check of generic parameters occurs at compile time). In addition, the performance of reflection is slightly worse, but it actually has little impact on the framework.

Reflection is slow for a few obvious reasons:
1. The compiler can do no optimization whatsoever as it can have no real idea about what you are doing. This probably goes for the `JIT` as well
2. Everything being invoked/created has to be _discovered_ (i.e. classes looked up by name, methods looked at for matches etc)
3. Arguments need to be dressed up via boxing/unboxing, packing into arrays, `Exceptions` wrapped in `InvocationTargetException`s and re-thrown etc.

Compare that with everything that reflection has to do:
- Check that there's a parameterless constructor
- Check the accessibility of the parameterless constructor
- Check that the caller has access to use reflection at all
- Work out (at execution time) how much space needs to be allocated
- Call into the constructor code (because it won't know beforehand that the constructor is empty)


**Reflection Practice**
Four ways to get Class objects: 
1. If you know the specific class, you can use:
	![[Pasted image 20241207180453.png]]
	
2. Get it by passing in the full path of the class: `Class.forName()`
	![[Pasted image 20241207180507.png]]
	
3. Get through object instance : `instance.getClass()`
	![[Pasted image 20241207180521.png]]
	
4. Obtained by passing the class path through the class loader
	![[Pasted image 20241207180533.png]]


