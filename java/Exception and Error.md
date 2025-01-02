
In Java, all exceptions have a common ancestor class `Throwable`the package  `java.lang`in. The class `Throwable` has two important subclasses:

- **`Exception`**: ==Exceptions that can be handled by the program itself== can `catch`be captured by `Exception`. They can be divided into Checked Exception (checked exceptions, must be handled) and Unchecked Exception (unchecked exceptions, can be left unhandled).

- **`Error`**：`Error`I==t is an error that the program cannot handle==. It is not recommended to `catch`capture it through . For example, Java virtual machine running error ( `Virtual MachineError`), virtual machine insufficient memory error ( `OutOfMemoryError`), class definition error ( `NoClassDefFoundError`), etc. When these exceptions occur, the Java virtual machine (JVM) generally chooses to terminate the thread.
