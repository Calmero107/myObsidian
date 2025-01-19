
- `@Autowired`It is the annotation provided by Spring and `@Resource`the annotation provided by JDK.
- `Autowired`The default injection method is `byType`(matching by type) and `@Resource`the default injection method is `byName`(matching by name).
- When an interface has multiple implementation classes, `@Autowired`both `@Resource`need to be named to correctly match the corresponding Bean. `Autowired`You can explicitly specify `@Qualifier`the name through annotations or `@Resource`through attributes.`name`
- `@Autowired`Supports use on constructors, methods, fields, and parameters. `@Resource`Mainly used for injection on fields and methods, not supported on constructors or parameters.