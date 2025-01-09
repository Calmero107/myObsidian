
- **Factory design pattern** : Spring uses factory pattern `BeanFactory`to `ApplicationContext`create bean objects.
- **Proxy design pattern** : implementation of Spring AOP functionality.
- **Singleton design pattern** : Beans in Spring are singletons by default.
- **Template method pattern** : In Spring `jdbcTemplate`, `hibernateTemplate`classes that end with Template and other classes that operate on the database use the template pattern.
- **Wrapper design pattern** : Our project needs to connect to multiple databases, and different customers will access different databases as needed during each visit. This pattern allows us to dynamically switch different data sources according to customer needs.
- **Observer pattern:** Spring event-driven model is a classic application of the observer pattern.
- **Adapter pattern** : Spring AOP enhancement or advice uses the adapter pattern, and spring MVC also uses the adapter pattern adaptation `Controller`.
- …