
IoC (Inverse of Control) is a design concept or a certain pattern. This design concept is **to give the control of objects that were originally created manually in the program to a third party such as an IoC container.** For the Spring framework we often use, the IoC container is actually a Map (key, value), which stores various objects. However, IoC is also used in other languages ​​and is not unique to Spring.

The most common and reasonable implementation of IoC is called Dependency Injection (DI for short).

![[Pasted image 20250107164302.png]]

What Lao Ma probably meant is that IoC is too common and vague, and many people will be confused by it, so it is better to use DI to accurately name this pattern.