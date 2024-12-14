
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



