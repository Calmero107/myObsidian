
`Annotation`(Annotation) is a new feature introduced in Java5. It can be regarded as a special annotation, which is mainly used to modify classes, methods or variables and provide certain information for the program to use during compilation or runtime.

Annotation is essentially a `Annotation`special interface that inherits:
	![[Pasted image 20241207181119.png]]

JDK provides many built-in annotations (such as `@Override`, `@Deprecated`), and we can also customize annotations.


Annotations take effect only after being parsed. There are two common parsing methods:
- **Direct scanning during compilation** : The compiler scans and processes the corresponding annotations when compiling Java code. For example, if a method uses `@Override`annotations, the compiler will detect whether the current method overrides the corresponding method of the parent class during compilation.
- **Processing through reflection at runtime** : Annotations that come with the framework (such as the Spring framework's `@Value`, `@Component`) are all processed through reflection.
