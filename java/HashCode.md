
Hash tables store key-value pairs, and their characteristics are: **they can quickly retrieve the corresponding "value" according to the "key". This is where the hash code is used! (You can quickly find the required object)**

- **Tăng hiệu suất khi làm việc với các Collection sử dụng Hashing**, như:
    - `HashMap`
    - `HashSet`
    - `Hashtable`
- **Dùng để xác định vị trí lưu trữ đối tượng** trong các cấu trúc dữ liệu dựa trên bảng băm (hash table).
- **Kết hợp với phương thức `equals()`** để đảm bảo tính nhất quán khi so sánh đối tượng.


**Why do we need hashCode?**

The following passage is excerpted from my Java enlightenment book "Head First Java":
	When you add an object to `HashSet`, `HashSet`the object's value will be calculated first `hashCode`to determine the location where the object is added. At the same time `hashCode`, the values ​​of other objects that have been added will be compared. If there is no match `hashCode`, `HashSet`it will be assumed that the object is not repeated. However, if `hashCode`an object with the same value is found, `equals()`the method will be called to check `hashCode`whether the equal objects are really the same. If the two are the same, `HashSet`the addition operation will not succeed. If they are different, they will be rehashed to another location. In this way, we can greatly reduce `equals`the number of , which greatly improves the execution speed.

- If `hashCode`the values ​​of two objects are equal, then the two objects are not necessarily equal (hash collision).
- We consider two objects equal if their `hashCode`values ​​are equal and `equals()`the method returns .`true`
- If `hashCode`the values ​​of two objects are not equal, we can directly consider that the two objects are not equal.


**Why do I have to override the hashCode() method when overriding equals

If you do not override the method `equals()`when overriding , what problems may arise when using .`hashCode()``HashMap`
- `equals`method determines that two objects are equal, then `hashCode`the values ​​of the two objects must also be equal.
- Even if two objects have the same `hashCode`value, they are not necessarily equal (hash collision).
