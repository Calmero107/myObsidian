
HTTP protocol, full name Hypertext Transfer Protocol. It is mainly used to regulate the behavior of browsers and servers.

HTTP is a ==stateless protocol==, which means that the server does ==not maintain any information about the client's past requests==. This is actually a lazy policy. Stateful protocols are more complicated and require the maintenance of state (historical information). Moreover, if the client or server fails, state inconsistencies will occur, and the cost of resolving such inconsistencies is higher.

Advantages of HTTP protocol:
==Strong scalability, fast speed, and good cross-platform support.==

It uses TCP (transport layer) as the underlying protocol and the default port is 80. The communication process is mainly as follows:
1. The server waits for client requests on port 80.
2. The browser initiates a TCP connection to the server (creates a socket).
3. The server accepts the TCP connection from the browser.
4. The browser (HTTP client) exchanges HTTP messages with the web server (HTTP server).
5. Closes the TCP connection.
