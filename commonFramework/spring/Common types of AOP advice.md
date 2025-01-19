
![[Pasted image 20250107162622.png]]

- **Before** (pre-notification): triggered before the method of the target object is called
- **After** (post notification): triggered after the target object's method is called
- **AfterReturning** (return notification): The method call of the target object is completed and triggered after the result value is returned.
- **AfterThrowing** (Exception Notification): Triggered after an exception is thrown/triggered during the execution of the target object's method. AfterReturning and AfterThrowing are mutually exclusive. If the method call succeeds without exception, there will be a return value; if the method throws an exception, there will be no return value.
- **Around** (around advice): programmatically control the method call of the target object. Around advice has the largest range of operations among all advice types, because it can directly get the target object and the method to be executed, so around advice can arbitrarily do things before or after the method call of the target object, or even not call the method of the target object.
