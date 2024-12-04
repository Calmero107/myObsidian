
Polymorphism, as the name implies, means that an object has multiple states, specifically, ==the reference of the parent class points to the instance of the child class.==

**Characteristics of polymorphism:**

- There is an inheritance (class)/implementation (interface) relationship between object types and reference types;
- The method call issued by the reference type variable can ==only be determined during program execution.==
- Polymorphism ==cannot call methods== that exist only ==in subclasses but not in parent classes==;
- If a subclass overrides a method in the parent class, the method actually executed is the method overridden by the subclass. If the subclass does not override the method in the parent class, the method of the parent class is executed.

