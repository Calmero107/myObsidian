
![[Pasted image 20241224112032.png]]

The serialization number `serialVersionUID`is part of the version control function. When ==deserializing, it will check `serialVersionUID`whether `serialVersionUID`it is consistent== with the current class. If `serialVersionUID`it is inconsistent, an exception will be thrown `InvalidClassException`. If it is not manually specified, the compiler will d==ynamically generate a default one `serialVersionUID`.==

`static`The modified variable is a static variable, which belongs to a class rather than an instance of the class, and will not be serialized itself. However, `serialVersionUID`it is a special case, and `serialVersionUID`its serialization is specially handled. When an object is serialized, `serialVersionUID`it is written to the serialized binary stream; when deserialized, it is also parsed and a consistency judgment is made to verify the version consistency of the serialized object. If the two do not match, the deserialization process will throw `InvalidClassException`, because this usually means that the definition of the serialized class has changed and may no longer be compatible.

In other words, `serialVersionUID`it is only used to be recognized by the JVM and is not actually serialized.

**What if there are some fields that you don't want to be serialized?**
You can use `transient`the keyword modification.