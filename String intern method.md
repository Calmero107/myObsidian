
`String.intern()`is a `native`(local) method used to process string object references in the string constant pool. Its workflow can be summarized into the following two cases:

- `intern()`The main function of this method is to ensure the uniqueness of string references in the constant pool.
- When called `intern()`, if a string with the same content already exists in the constant pool, a reference to the object already in the constant pool is returned; otherwise, the string is added to the constant pool and its reference is returned.