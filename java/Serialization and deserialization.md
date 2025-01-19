
- **Serialization** : Converting a data structure or object into a form that can be stored or transmitted, usually a binary byte stream, or a text format such as JSON, XML, etc.
- **Deserialization** : The process of converting the data generated during the serialization process into the original data structure or object

The following are common application scenarios for serialization (marshalling) and deserialization (demarshalling, deserialization, unmarshalling):

- Objects need to be serialized before being transmitted over the network (such as when calling a remote method call (RPC)), and then deserialized after receiving the serialized object;
- Objects need to be serialized before being stored in a file, and objects need to be deserialized before being read from a file;
- Serialization is required before storing objects in a database (such as Redis), and deserialization is required to read objects from the cache database;
- Objects need to be serialized before being stored in memory, and need to be deserialized after being read from memory.

**The main purpose of serialization is to transmit objects over the network or to store objects in the file system, database, or memory.**

![[Pasted image 20241224110117.png]]

**To which layer of the [[TCP IP four-layer model]] does the serialization protocol correspond?**

In the [[OSI seven-layer model]] protocol model, the presentation layer mainly processes the user data of the application layer and converts it into a binary stream. In other words, it converts the binary stream into the user data of the application layer. Doesn't this correspond to serialization and deserialization?

Because the application layer, presentation layer, and session layer in the OSI seven-layer protocol model all correspond to the application layer in the TCP/IP four-layer model, the serialization protocol is part of the TCP/IP protocol application layer.

