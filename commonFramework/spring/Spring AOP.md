
[[AOP]](Aspect-Oriented Programming)

AOP can encapsulate logic or responsibilities that are not related to the business but are commonly called by business modules, which makes it easier to reduce duplicate code in the system, reduce the coupling between modules, and facilitate future scalability and maintainability.
Spring AOP is based on dynamic proxy.
If the object to be proxied implements a certain interface, Spring AOP will use **JDK Proxy** to create a proxy object. For objects that do not implement the interface, JDK Proxy cannot be used for proxying. At this time, Spring AOP will use **Cglib** to generate a subclass of the proxied object as a proxy.

![[Pasted image 20250107155627.png]]

What is the difference between [[Spring AOP and AspectJ AOP]]?

How to control the [[Execution order of multiple aspects]]?