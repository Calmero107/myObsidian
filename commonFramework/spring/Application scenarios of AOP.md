
- Logging: Customize logging annotations and use AOP to implement logging with just one line of code.

- Performance statistics: Use AOP to count the execution time of the target method before and after execution, which is convenient for optimization and analysis.

- Transaction management: `@Transactional`Annotations allow Spring to manage transactions for us, such as rolling back abnormal operations, eliminating the need for repeated transaction management logic. `@Transactional`Annotations are implemented based on AOP.

- Permission control: Use AOP to determine whether the user has the required permissions before the target method is executed. If yes, execute the target method, otherwise do not execute it. For example, SpringSecurity `@PreAuthorize`can customize permission checking by annotating a line of code.

- Interface current limiting: Use AOP to limit the current of requests through specific current limiting algorithms and implementations before the target method is executed.
- Cache management: Use AOP to read and update the cache before and after the target method is executed.
- 