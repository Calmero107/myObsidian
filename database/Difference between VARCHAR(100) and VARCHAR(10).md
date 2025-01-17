
VARCHAR(100) and VARCHAR(10) are both variable-length types, which means they can store up to 100 characters and 10 characters respectively. Therefore, VARCHAR(100) can meet the needs of storing a wider range of characters and has better business scalability. However, when VARCHAR(10) stores more than 10 characters, the table structure needs to be modified.

Although VARCHAR(100) and VARCHAR(10) can store different ranges of characters, the two actually ==take up the same amount of disk storage space to store the same string==, which is a point that many people tend to misunderstand.

However, ==VARCHAR(100) consumes more memory==. This is because when the VARCHAR type is operated in memory, a fixed-size memory block is usually allocated to store the value, that is, the length defined in the character type is used. For example, when sorting, VARCHAR(100) is sorted according to the length of 100, whi