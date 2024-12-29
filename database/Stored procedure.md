
We can think of a stored procedure as a collection of SQL statements with some logic control statements in between. Stored procedures are very useful when the business is complex. For example, many times we may need to write a long string of SQL statements to complete an operation. In this case, we can write a stored procedure, which is ==convenient== for our next call. Once the stored procedure is debugged and passed, it can run stably. In addition, using a stored procedure is ==faster== than executing a simple SQL statement because the stored procedure is ==precompiled==.

Stored procedures are rarely used in Internet companies because they are difficult to debug and expand, are not portable, and consume database resources.
