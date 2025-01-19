
OOP cannot handle some common behaviors that are scattered across multiple classes or objects (such as logging, transaction management, permission control, interface current limiting, interface idempotence, etc.) well. These behaviors are usually called **cross-cutting concerns** . If we implement these behaviors repeatedly in each class or object, it will lead to redundant, complex and difficult to maintain code.

AOP can separate cross-cutting concerns (such as logging, transaction management, permission control, interface current limiting, interface idempotence, etc.) from **core business logic (core concerns) to achieve separation of concerns.**
