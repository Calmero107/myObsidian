
Different types of objects often have a certain amount in common with each other. At the same time, each object also defines additional characteristics that make them unique.
Inheritance is a technique that uses the definition of an existing class as a basis for creating a new class. The definition of a new class can add new data or new functions, or use the functions of the parent class, but it cannot selectively inherit the parent class. By using inheritance, new classes can be created quickly, which can improve code reuse and program maintainability, save a lot of time in creating new classes, and improve our development efficiency.

**Please remember the following 3 points about inheritance:**

1. The subclass has all the properties and methods of the parent class object (including private properties and private methods), but the subclass cannot access the private properties and methods in the parent class, **it only owns them** .
2. Subclasses can have their own properties and methods, that is, subclasses can extend parent classes.
3. Subclasses can implement parent class methods in their own way (to be introduced later).
