
The Spring Framework solves this problem by using a three-level cache to ensure that beans are created correctly even in the case of circular dependencies.

Spring's three-level cache includes:
- **First-level cache (singletonObjects)** : Stores final-form beans (instantiated, attribute-filled, initialized), singleton pools, created for "Spring singleton attributes". Generally, we get beans from here, but not all beans are in the singleton pool, for example, prototype beans are not in it.
- **Second-level cache (earlySingletonObjects)** : stores transition beans (semi-finished products, properties not yet filled), that is, objects generated in the third-level cache . When used in conjunction with the third-level cache, it can prevent the generation of new proxy objects for `ObjectFactory`each call in the AOP case .`ObjectFactory#getObject()`
- **Level 3 cache (singletonFactories)** : stores `ObjectFactory`methods `ObjectFactory`( the method `getObject()`that is ultimately called `getEarlyBeanReference()`) that can generate the original Bean object or proxy object (if the Bean is proxied by an AOP aspect). Level 3 cache is only effective for singleton beans.
