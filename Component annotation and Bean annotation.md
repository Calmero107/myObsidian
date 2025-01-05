
`@Component`Annotations act ==on classes==, whereas `@Bean`annotations act ==on methods==.

`@Component`Usually, it is automatically detected and automatically assembled into the Spring container through classpath scanning (we can use `@ComponentScan`annotations to define the path to be scanned to identify the class that needs to be assembled and automatically assemble it into the Spring bean container). `@Bean`Annotations are usually defined in the method marked with the annotation to generate this bean, `@Bean`telling Spring that this is an instance of a certain class and to return it to me when I need it.

`@Bean``@Component`Annotations are more customizable than annotations, and in many places we can only `@Bean`register beans through annotations. For example, ==when we reference classes in third-party libraries== that need to be assembled into `Spring`containers, we can ==only `@Bean`do this== through.

![[Pasted image 20250106170815.png]]
