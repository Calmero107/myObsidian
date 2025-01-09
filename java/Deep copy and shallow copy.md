- **Shallow copy** : A shallow copy creates a new object on the heap (a point different from a reference copy). However, if the property inside the original object is a reference type, a shallow copy will directly copy the reference address of the internal object, which means that ==the copied object and the original object share the same internal object.==
- **Deep copy** : A deep copy completely copies the entire object, including the internal objects contained in this object.

	![[Pasted image 20241222173958.png]]


**So what is a reference copy?** Simply put, a reference copy is two different references pointing to the same object.

	Reference copy                Shallow copy                   Deep copy     

![[Pasted image 20241222174456.png]]