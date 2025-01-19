
**What interfaces and abstract classes have in common**

- **Instantiation** : Interfaces and abstract classes ==cannot be instantiated directly==. They can only be implemented (interfaces) or inherited (abstract classes) to create specific objects.
- **Abstract methods** : Both interfaces and abstract classes ==can contain abstract methods.== Abstract methods have no method body and must be implemented in subclasses or implementation classes.


**Difference between interface and abstract class**
- **Design purpose** : ==Interfaces== are mainly used to ==constrain the behavior of a class==. If you implement an interface, you have the corresponding behavior. ==Abstract classes== are mainly used for code reuse, ==emphasizing the ownership relationship==.
- **Inheritance and implementation** : ==A class can only inherit one class== (including abstract classes) because Java does not support multiple inheritance. However, ==a class can implement multiple interfaces, and an interface can inherit multiple other interfaces==.
- **Member variables** : Member variables in an ==interface== can ==only be `public static final`==of type, cannot be modified, and must have an initial value. Member variables of an abstract class can have any modifiers ( ,, `private`) , and can be redefined or assigned in a subclass.`protected``public`
- **method** :
	- Before Java 8, methods in interfaces were by default static , that is, they could only have method declarations. Since Java 8, you can define (default) methods and (static) methods `public abstract`in interfaces . Since Java 9, interfaces can contain methods.`default``static``private`
	- Abstract classes can contain abstract methods and non-abstract methods. Abstract methods have no method body and must be implemented in subclasses. Non-abstract methods have concrete implementations and can be used directly in abstract classes or overridden in subclasses.