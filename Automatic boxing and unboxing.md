**What is automatic unpacking?**

- **Boxing** : Wrapping primitive types with their corresponding reference types;
- **Unboxing** : converting the package type to the basic data type;

	Integer i = 10; //Boxing 
	int n = i; //Unboxing

Boxing is actually calling `valueOf()`the method of the packaging class, and unboxing is actually calling `xxxValue()`the method.
- `Integer i = 10`Equivalent to`Integer i = Integer.valueOf(10)`
- `int n = i`is equivalent to `int n = i.intValue()`;

Note: **Frequent unpacking and packing will seriously affect the system performance. We should try to avoid unnecessary unpacking and packing operations.**