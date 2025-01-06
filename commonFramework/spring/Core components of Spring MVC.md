
**`DispatcherServlet`**: **The core central processing unit** , responsible for receiving requests, distributing them, and giving responses to clients.

**`HandlerMapping`**: **The processor mapper** matches and searches for the ones that can be processed according to the URL `Handler`, and encapsulates the interceptors and involved in the request `Handler`together.

**`HandlerAdapter`**：**Processor adapter** , based on `HandlerMapping`the found `Handler`, adapts and executes the corresponding `Handler`;

**`Handler`**: **Request handler** , the handler that handles the actual request.

**`ViewResolver`**: **View resolver** , according to `Handler`the logical view/view returned, parses and renders the real view, and passes it to `DispatcherServlet`the response client

