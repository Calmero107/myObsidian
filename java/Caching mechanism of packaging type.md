

`Byte`, `Short`, `Integer`, `Long`These 4 wrapper classes create cache data of the corresponding type with values **​​[-128, 127]**`Character` by default, create cache data with values ​​in the range of **[0, 127]**`Boolean` , and directly return `True`or `False`.

If the corresponding range is exceeded, a new object will still be created. The size of the cache range is just a trade-off between performance and resources.

The wrapper classes for the two floating-point number types `Float`do `Double`not implement a caching mechanism.

Remember: **all value comparisons between integer wrapper class objects should be done using the equals method** .

![[Pasted image 20241220170315.png]]