
`@Component`: A general annotation that can ==mark any class as `Spring`a component==. If you don't know which layer a bean belongs to, you can use `@Component`annotations. (đánh dấu trên các class để cho biết chúng là các bean được quản lý bởi Spring Boot.)

`@Repository`: Corresponding to the persistence layer, namely the Dao layer, it is mainly used for database-related operations.

`@Service`: Corresponding to the service layer, it mainly involves some complex logic and requires the use of the Dao layer.

`@Controller`: Corresponding to the Spring MVC control layer, it is mainly used to accept user requests and call `Service`the layer to return data to the front-end page.
