Service Provider Interface
![[Pasted image 20241224093511.png]]
![[Pasted image 20241224092442.png]]

Service Provider Interface (SPI) provides the ability to extend application functionality by adding service implementations that can modify, replace or extend the original behavior of an application.

SPI separates the service interface from the specific service implementation, decoupling the service caller from the service implementer, which can improve the scalability and maintainability of the program. Modifying or replacing the service implementation does not require modifying the caller.

Many frameworks use the Java SPI mechanism, such as the Spring framework, database loading driver, log interface, and Dubbo extension implementation.

**What is the difference between SPI and API (Application Programming Interface)?**
Generally, modules communicate with each other through interfaces, so we introduce an "interface" between the service caller and the service implementer (also called the service provider).
- When the implementer provides ==an interface and an implementation==, we can use the implementer's interface to obtain the capabilities provided by the implementer. This is **the API** . In this case, the interface and the implementation are both placed in the implementer's package. The caller calls the implementer's functions through the interface ==without having to worry about the specific implementation details.==
- When the interface exists on the caller side, this is **SPI** . The interface caller determines the interface rules, and then different manufacturers implement the interface according to the rules to provide services.

**What are the advantages and disadvantages of SPI?**
The SPI mechanism can greatly improve the flexibility of interface design, but the SPI mechanism also has some disadvantages, such as:
- It is necessary to traverse and load all implementation classes, and it is not possible to load on demand, so the efficiency is relatively low.
- When multiple are called at `ServiceLoader`the same `load`time, there will be concurrency issues.


*Đọc thêm:*
Object-oriented design encourages programming between modules ==based on interfaces rather than specific implementations to reduce coupling between modules==, follow the dependency inversion principle, and support the open-closed principle (open for extension, closed for modification). However, direct reliance on specific implementations will result in the need to ==modify the code when replacing the implementation==, which violates the open-closed principle. To solve this problem, ==SPI came into being==, which provides a service discovery mechanism that ==allows specific implementations to be dynamically specified outside the program==. This is similar to the idea of ​​inversion of control (IoC), which transfers the control of component assembly to outside the program.

The SPI mechanism also solves the limitations of the parent delegation model in the Java class loading system. Although [the parent delegation model](https://javaguide.cn/java/jvm/classloader.html) ensures the security and consistency of the core library, it also limits the core library or extension library from loading classes on the application class path (usually implemented by a third party). SPI allows the core or extension library to define service interfaces, and third-party developers to provide and deploy implementations. The SPI service loading mechanism dynamically discovers and loads these implementations at runtime. For example, JDBC 4.0 and later versions use SPI to automatically discover and load database drivers. Developers only need to place the driver JAR package on the class path, without `Class.forName()`explicitly loading the driver class.
