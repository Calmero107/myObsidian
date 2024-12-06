
- `String getMessage()`: Returns detailed information when an exception occurs
- `String toString()`: Returns a brief description of the exception that occurred
- `String getLocalizedMessage()`: Returns the localized information of the exception object. Use `Throwable`a subclass that overrides this method to generate localized information. If the subclass does not override this method, the information returned by this method `getMessage()`is the same as the result returned
- `void printStackTrace()``Throwable`: Print the exception information encapsulated by the object on the console
