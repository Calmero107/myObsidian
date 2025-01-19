
The difference between DECIMAL and FLOAT is: **DECIMAL is a fixed-point number, FLOAT/DOUBLE is a floating-point number. ==DECIMAL can store exact decimal values==, while FLOAT/DOUBLE can only store approximate decimal values.**

DECIMAL is used to store decimals with precision requirements, such as currency-related data, to avoid the loss of precision caused by floating-point numbers.

In Java, the MySQL DECIMAL type corresponds to the Java class `java.math.BigDecimal`.
