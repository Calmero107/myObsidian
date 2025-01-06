
![[Pasted image 20250107165722.png]]

1. `DispatcherServlet` receives the request.
2. `DispatcherServlet` dispatches the task of selecting an appropriate `controller` to `HandlerMapping`. `HandlerMapping` selects the controller which is mapped to the incoming request URL and returns the `(selected Handler)` and `Controller` to `DispatcherServlet`.
3. `DispatcherServlet` dispatches the task of executing of business logic of `Controller` to `HandlerAdapter`.
4. `HandlerAdapter` calls the business logic process of `Controller`.
5. `Controller` executes the business logic, sets the processing result in `Model` and returns the logical name of view to `HandlerAdapter`.
6. `DispatcherServlet` dispatches the task of resolving the `View` corresponding to the View name to `ViewResolver`. `ViewResolver` returns the `View` mapped to View name.
7. `DispatcherServlet` dispatches the rendering process to returned `View`.
8. `View` renders `Model` data and returns the response.


- ==Use `@RestController`annotations instead of traditional `@Controller`annotations so that all methods will return data in JSON format by default instead of trying to parse views.==
- ==If you are using it `@Controller`, you can combine it with `@ResponseBody`annotations to return JSON.==