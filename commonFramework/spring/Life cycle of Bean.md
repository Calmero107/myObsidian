
==instantiation -> property assignment -> initialization -> destruction.==

**Create an instance of the Bean** : The Bean container first finds the Bean definition in the configuration file, and then uses the Java reflection API to create an instance of the Bean.

**Bean property assignment/filling** : Set relevant properties and dependencies for the Bean, such as `@Autowired`objects injected by annotations, `@Value`injected values, `setter`method or constructor injected dependencies and values, and `@Resource`various injected resources.

**Bean initialization** :
- If the Bean implements `BeanNameAware`the interface, call `setBeanName()`the method and pass in the name of the Bean.
- If the Bean implements `BeanClassLoaderAware`the interface, call `setBeanClassLoader()`the method and pass in `ClassLoader`the instance of the object.
- If the Bean implements `BeanFactoryAware`the interface, call `setBeanFactory()`the method and pass in `BeanFactory`the instance of the object.
- Similar to the above, if other interfaces are implemented `*.Aware`, the corresponding methods are called.
- If there is an object related to the Spring container that loaded this Bean `BeanPostProcessor`, execute `postProcessBeforeInitialization()`the method
- If the Bean implements `InitializingBean`the interface, execute `afterPropertiesSet()`the method.
- If the Bean definition in the configuration file contains `init-method`the attribute, the specified method is executed.
- If there is an object associated with the Spring container that loaded this Bean `BeanPostProcessor`, execute `postProcessAfterInitialization()`the method.

**Destroying Beans** : Destruction does not mean destroying the Bean immediately, but recording the Bean's destruction method first. When the Bean or container needs to be destroyed in the future, these methods will be called to release the resources held by the Bean.
- If the Bean implements `DisposableBean`the interface, execute `destroy()`the method.
- If the bean definition in the configuration file contains `destroy-method`the attribute, execute the specified bean destruction method. Alternatively, you can also directly `@PreDestroy`annotate the method to be executed before the bean is destroyed.


![[Pasted image 20250107152538.png]]
