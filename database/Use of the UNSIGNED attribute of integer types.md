
Integer types in MySQL can use the optional UNSIGNED attribute to represent unsigned integers that do ==not allow negative values==. Using the UNSIGNED attribute ==doubles the upper limit of positive integers== because it does not need to store negative values.

For example, the range of TINYINT UNSIGNED type values ​​is 0 to 255, while the range of ordinary TINYINT type values ​​is -128 to 127. The range of INT UNSIGNED type values ​​is 0 to 4,294,967,295, while the range of ordinary INT type values ​​is -2,147,483,648 to 2,147,483,647.

For ID columns that start incrementing from 0, using the UNSIGNED attribute can be very suitable because negative values ​​are not allowed and a larger upper range can be provided, providing more ID values ​​are available.
