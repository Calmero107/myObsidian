
The core module of the Spring framework, or the basic module, mainly provides support for IoC dependency injection. All other functions of Spring basically need to rely on this module, as we can see from the dependency diagram of each module of Spring above.

- **spring-core** : The basic core tool class of the Spring framework.
- **spring-beans** : Provides support for bean creation, configuration, and management.
- **spring-context** : Provides support for internationalization, event propagation, resource loading and other functions.
- **spring-expression** : Provides support for the Spring Expression Language SpEL. It only depends on the core module and does not depend on other modules. It can be used alone.

![[Pasted image 20250103150533.png]]