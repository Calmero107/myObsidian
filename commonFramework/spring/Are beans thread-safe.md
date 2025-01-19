
the beans in the Spring framework are thread-safe ==depends on their scope and state==.

In the prototype scope, a new bean instance is created each time it is acquired, so there is no resource competition problem, so there is no thread safety problem.
In the singleton scope, there is only one bean instance in the IoC container, and there may be resource competition problems. If the bean is stateful, there will be thread safety issues


There are three common solutions to the thread safety problem of stateful singleton beans:
1. **Avoid mutable member variables** : Try to design beans to be stateless.
2. **Usage`ThreadLocal`** : Store mutable member variables in `ThreadLocal`to ensure thread independence.
3. **Use synchronization mechanism** : Use `synchronized`or `ReentrantLock`for synchronization control to ensure thread safety.