
The TEXT type is similar to CHAR (0-255 bytes) and VARCHAR (0-65,535 bytes), but can store longer strings, that is, long text data, such as blog content.
![[Pasted image 20250114163908.png]]

The BLOB type is mainly used to store binary large objects, such as pictures, audio and video files.
![[Pasted image 20250114163929.png]]

In daily development, the TEXT type is rarely used, but it is used occasionally, while the BLOB type is rarely used. ==If the expected length range can be met by VARCHAR, it is recommended to avoid using TEXT.==

Database specifications generally do not recommend the use of BLOB and TEXT types, which have some disadvantages and limitations, such as:
- There cannot be a default value.
- ==When using temporary tables, you cannot use memory temporary tables and can only create temporary tables on disk (mentioned in the book "High Performance MySQL").==
- The retrieval efficiency is low.
- You ==cannot create an index directly==, you need to specify a prefix length.
- Can consume significant network and IO bandwidth.
- Might cause DML operations on the table to slow down.
- ……