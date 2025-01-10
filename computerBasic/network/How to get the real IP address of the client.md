
There are many ways to obtain the client's real IP, which are mainly divided into application layer method, transport layer method and network layer method.

**Application layer method** :
Obtaining it through [the X-Forwarded-For](https://en.wikipedia.org/wiki/X-Forwarded-For) request header is simple and convenient. However, this method cannot guarantee that the real IP is obtained, because the X-Forwarded-For field may be forged. If it passes through multiple proxy servers, the X-Forwarded-For field may have multiple values ​​(with all the proxy server IP addresses in the entire request chain). Moreover, this method is only applicable to HTTP and SMTP protocols.

**Transport layer methods** :
Use the TCP Options field to carry the real source IP information. This method is applicable to any TCP-based protocol and is not limited by the application layer. However, this is not supported by the TCP standard, so both parties in the communication need to be modified. In other words: for the sender, it is necessary to be able to insert the real source IP into the TCP Options. For the receiver, it is necessary to be able to read the IP address in the TCP Options.

You can also use the Proxy Protocol to pass the client IP and Port information. This method can use Nginx or other reverse proxy servers that support the protocol to obtain the real IP or resolve the real IP on the business server.

**Network layer methods** :
Tunnel + DSR mode. This method can be applied to any protocol, but it is more troublesome to implement and has certain limitations. It is generally not used in practical applications.
