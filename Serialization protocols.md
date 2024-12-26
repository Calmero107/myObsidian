
The serialization method that comes with JDK is generally not used because of its low serialization efficiency and security issues. The more commonly used serialization protocols are Hessian, Kryo, Protobuf, and ProtoStuff, which are all binary-based serialization protocols.

Text serialization methods such as JSON and XML have good readability but poor performance, so they are generally not chosen.


[[JDK's own serialization]]

[[Kryo]]

[[Protobuf]]

[[ProtoStuff]]

[[Hessian]]


Kryo is a serialization method specifically for the Java language and has very good performance. If your application is specifically for the Java language, you can consider using it. An article on the Dubbo official website mentioned that Kryo is recommended as the serialization method for the production environment.

Protobuf, ProtoStuff, and hessian are all cross-language serialization methods. If you have cross-language requirements, you can consider using them.

In addition to the serialization methods I introduced above, there are also Thrift and Avro.


**Why is it not recommended to use the serialization that comes with JDK?**
We rarely or almost never use the serialization method that comes with JDK directly. The main reasons are as follows:
- **Cross-language calls are not supported** : If the service being called is developed in other languages, it is not supported.
- **Poor performance** : The performance is lower than other serialization frameworks. The main reason is that the byte array after serialization is larger, which increases the transmission cost.
- **Security issues exist** : Serialization and deserialization themselves do not have any problems. However, when the input deserialized data can be controlled by the user, the attacker can construct malicious input to make the deserialization generate unexpected objects and execute arbitrary constructed code in the process. Related reading: [Application Security: The Tragedy of JAVA Deserialization Vulnerabilities](https://cryin.github.io/blog/secure-development-java-deserialization-vulnerability/) .




