
Its core idea is to separate cross-cutting concerns from the core business logic and form **aspects** .

![[Pasted image 20250107161945.png]]

- **Cross-cutting concerns** : Common behaviors in multiple classes or objects (such as logging, transaction management, permission control, interface current limiting, interface idempotence, etc.).
- **Aspect** : A class that encapsulates cross-cutting concerns. An aspect is a class. An aspect can define multiple notifications to implement specific functions.
- **JoinPoint** : A join point is a specific moment when a method is called or executed (such as a method call, an exception is thrown, etc.).
- **Advice** : Advice is the operation that the aspect will perform at a certain connection point. There are five types of advice, namely before advice (Before), after advice (After), return advice (AfterReturning), exception advice (AfterThrowing) and around advice (Around). The first four types of advice are executed before and after the target method, while around advice can control the execution process of the target method.
- **Pointcut** : A pointcut is an expression that is used to match which join points need to be enhanced by aspects. Pointcuts can be defined by annotations, regular expressions, logical operations, etc. For example, `execution(* com.xyz.service..*(..))`matching `com.xyz.service`classes or interfaces under a package and its subpackages.
- **Weaving** : Weaving is the process of connecting aspects to target objects, that is, applying advice to the connection points that match the pointcuts. There are two common weaving opportunities, namely compile-time weaving (such as AspectJ) and runtime weaving (such as AspectJ, Spring AOP).
