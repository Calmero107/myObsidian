
- **Scope (resource definition):** Any object that implements `java.lang.AutoCloseable`or`java.io.Closeable`
- **Closing resources and finally blocks are executed in the same order:** In `try-with-resources`a statement, any catch or finally blocks are executed after the declared resources are closed.

When faced with resources that must be closed, we should always use `try-with-resources`instead of `try-finally`. The resulting code is shorter and clearer, and the exceptions generated are more useful to us. The `try-with-resources` statement makes it easier to write code that must close resources, which is almost impossible with `try-finally`.

In Java, resources like `InputStream`, `OutputStream`, `Scanner`, `PrintWriter`etc. require us to call `close()`methods to close them manually. Generally, we use `try-catch-finally`statements to achieve this requirement.

![[Pasted image 20241223151729.png]]

![[Pasted image 20241223151741.png]]

Of course, when multiple resources need to be closed, `try-with-resources`it is very simple to implement using . If you still use it, `try-catch-finally`it may cause many problems.

`try-with-resources`Multiple resources can be declared in a block by separating them with semicolons .

![[Pasted image 20241223151834.png]]