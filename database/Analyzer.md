
If MySQL does not hit the cache, it will enter the analyzer, which is mainly used to analyze the purpose of the SQL statement. The analyzer is also divided into several steps:

- **The first step is lexical analysis** . A SQL statement consists of multiple strings. First, we need to extract keywords, such as select, propose the query table, propose the field name, propose the query condition, etc. After completing these operations, we will enter the second step.
- **The second step, syntax analysis** , is mainly to determine whether the SQL you entered is correct and conforms to the MySQL syntax.

After completing these two steps, MySQL is ready to start executing, but how to execute and how to get the best results? This is when the optimizer comes into play.
