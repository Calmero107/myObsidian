
- `try`Block: used to catch exceptions. It can be followed by zero or more `catch`blocks. If there is no `catch`block, it must be followed by a `finally`block.
- `catch`Block: used to handle exceptions caught by try.
- `finally``finally`Block: Statements in the block are executed regardless of whether the exception is caught or handled . When a statement is encountered in `try`a block or a block, the block is executed before the method returns.`catch``return``finally`

**Note: Do not use return in the finally block!** When there are return statements in both the try and finally statements, the return statement in the try block will be ignored. This is because the return value in the try statement will be temporarily stored in a local variable. When the return in the finally statement is executed, the value of the local variable becomes the return value in the finally statement.

If the `try`clause executes a _return_ , the compiled code does the following:

1. Saves the return value (if any) in a local variable.
2. Executes a _jsr_ to the code for the `finally`clause.
3. Upon return from the `finally`clause, returns the value saved in the local variable.