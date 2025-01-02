
**Java Generics** is a new feature introduced in JDK 5. Using generic parameters can enhance the readability and stability of the code.

In addition, the native `List`return type `Object`needs to be manually converted before it can be used, but the compiler automatically converts it after using generics.

There are generally three ways to use generics: **generic classes** , **generic interfaces** , and **generic methods** .

 Note: `public static < E > void printArray( E[] inputArray )`Generally called static generic method; in Java, generic is just a placeholder and can only be used after the type is passed. The type parameter can only be passed when the class is instantiated. Since the static method is loaded before the class is instantiated, that is to say, the generic in the class has not passed the real type parameter, the static method has been loaded. Therefore, the static generic method cannot use the generic declared in the class. You can only use the generic declared by yourself.`<E>`