
`String`It is ==immutable==

Both `StringBuilder` and `StringBuffer` inherit from `AbstractStringBuilder`the class. In it, `AbstractStringBuilder`character arrays are also used to store strings, but the `final`and `private`keywords are not used for modification. `AbstractStringBuilder`class provides many methods for ==modifying strings==, such as `append`the method.


==**Summary of the use of the three:**==

- Operate on small amounts of data: Applicable`String`
- Single-threaded string buffer operation for large amounts of data: Applicable`StringBuilder`
- Multithreaded string buffer operation with large amounts of data: Applicable`StringBuffer`


**Thread Safety**
`String`The objects in are immutable, which can be understood as constants and ==thread-safe.==
`AbstractStringBuilder`is the common parent class of and , and defines some basic string operations, such as `StringBuilder`, , , and other public methods. There is no synchronization lock added to the method, so it is ==not thread-safe.==`StringBuffer``expandCapacity``append``insert``indexOf``StringBuffer``StringBuilder`


**Performance**
Each `String`time the type is changed, a new `String`object is generated and the pointer is pointed to the new `String`object. 
(Nhưng khi sử dụng 1 literal object - “sử dụng chuỗi thuần tuý”, nếu đối tượng này đã tồn tại trong bộ nhớ heap *trong String Pool* rồi thì sẽ không tạo mới đối tượng nữa, sử dụng lại, giúp tiết kiệm bộ nhớ heap hơn.)

![[Pasted image 20241223095414.png]] 
![[Pasted image 20241223095737.png]]

`StringBuffer`Each time `StringBuffer`the object itself is operated on, rather than generating a new object and changing the object reference. Using can only achieve a 10% to 15% performance improvement `StringBuilder`over using in the same situation, but at the risk of multi-threaded insecurity.`StringBuffer`


