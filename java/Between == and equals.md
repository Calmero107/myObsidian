
- For primitive data types, `==`the comparison is done on the value.
- For reference data types, `==`the memory addresses of the objects are compared.


**`equals()`**It cannot be used to determine the variables of basic data types, but can only be used to determine whether two objects are equal. `equals()`Methods exist in `Object`classes, and `Object`classes are the direct or indirect parent classes of all classes, so all classes have `equals()`methods.


`equals()`There are two usage cases for this method:

- **The class has no overridden `equals()`method** : `equals()`when comparing two objects of this class, it is equivalent to comparing the two objects through "==", and the default method used is `Object`the class `equals()`method.
- **Class overrides `equals()`method** : Generally, we override `equals()`methods to compare whether the properties in two objects are equal; if their properties are equal, it returns true (that is, the two objects are considered equal).