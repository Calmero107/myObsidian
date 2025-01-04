**Syntax form** : From the grammatical form (từ hình thức ngữ pháp), member variables belong to the class, while local variables are variables defined in the code block or method or are parameters of the method; member variables can be modified by modifiers such as `public`,,, `private`etc. `static`, while local variables cannot be modified by access control modifiers and `static`; however, both member variables and local variables can be `final`modified by.

**Storage method** : From the perspective of how variables are stored in memory, if a member variable is `static`modified with , then the member variable belongs to the class. If it is not `static`modified with , then the member variable belongs to the instance. Objects exist in the heap memory, while local variables exist in the stack memory.

**Survival time** : From the perspective of (từ góc nhìn của ...) the survival time of variables in memory, member variables are part of the object and exist when the object is created, while local variables are automatically generated when a method is called and disappear when the method call ends.

**Default value** : From the perspective of whether the variable has a default value, if a member variable is not assigned an initial value, it will be automatically assigned the default value of the type (with one exception: `final`the modified member variable must also be explicitly assigned), while local variables will not be automatically assigned.

**Why do member variables have default values?**

Regardless of the variable type, what happens if there is no default value? The variable stores an arbitrary random value corresponding to the memory address, and the program will fail to read the value when it runs.

There are two ways to set the default value: manual and automatic. According to the first point, if there is no manual assignment, it must be automatically assigned. Member variables can be manually assigned at runtime using methods such as reflection, but local variables cannot.

For the compiler (javac), it is easy to judge that a local variable has no value, and an error can be directly reported. However, member variables may be assigned values ​​at runtime, which is impossible to judge. Falsely reporting "no default value" will affect the user experience, so automatic default value assignment is adopted.
