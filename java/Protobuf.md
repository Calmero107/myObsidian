
Protobuf comes from Google, and has excellent performance, supports multiple languages, and is cross-platform. However, it is too cumbersome to use because you need to define the IDL file and generate the corresponding serialization code yourself. Although this is not flexible, on the other hand, protobuf does not have the risk of serialization vulnerabilities.

Protobuf contains the definition of serialization format, libraries in various languages, and an IDL compiler. Normally you need to define the proto file and then use the IDL compiler to compile it into the language you need.