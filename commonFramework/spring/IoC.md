
**IoC (Inversion of Control)** is ==a design concept, not a specific technical implementation==. The idea of ​​IoC is to hand over the control of objects that were originally created manually in the program to the Spring framework for management. However, IoC is not unique to Spring and is also used in other languages.

- **Control** : refers to the power to create (instantiate, manage) objects
- **Inversion** : Control is handed over to the external environment (Spring framework, IoC container)

[[What problem does IoC solve]]?

Is there a [[Difference between IoC and DI]]?

The ==interdependencies between objects are managed by the IoC container==, which then completes the object injection. This greatly simplifies application development and frees applications from complex dependencies. The IoC container is like a factory. When we need to create an object, we ==only need to configure the configuration file/annotation== without having to consider how the object is created.

In an actual project, a Service class may depend on many other classes. If we need to instantiate this Service, you may have to figure out the constructors of all the underlying classes of this Service every time, which may drive people crazy. If you use IoC, you only need to configure it and then reference it where needed, which greatly increases the maintainability of the project and reduces the difficulty of development.

In Spring, the IoC container is the carrier used by Spring to implement IoC. The ==IoC container is actually a Map (key, value)==, which stores various objects.

In the Spring era, we generally configured Beans through XML files. Later, developers felt that XML files were not a good option, so SpringBoot annotation configuration gradually became popular.

![[Pasted image 20250106165408.png]]