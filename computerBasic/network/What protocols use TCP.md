
**Protocols running on top of TCP**:

**HTTP protocol (before HTTP/3.0)** : Hypertext Transfer Protocol (HTTP) is a protocol for transmitting hypertext and multimedia content, mainly designed for communication between web browsers and web servers. When we use a browser to browse the web, our web pages are loaded through HTTP requests.

**[[HTTPS protocol]]** : a more secure Hypertext Transfer Protocol (HTTPS, Hypertext Transfer Protocol Secure), HTTP protocol in SSL guise

**FTP Protocol** : File Transfer Protocol FTP (File Transfer Protocol) is a protocol used to transfer files between computers, which can shield the operating system and file storage method. Note: FTP is an insecure protocol because it does not encrypt data during transmission. It is recommended to use more secure protocols such as SFTP when transferring sensitive data.

**SMTP protocol** : The abbreviation of Simple Mail Transfer Protocol (SMTP), is a protocol used to send emails. Note: SMTP protocol is only responsible for sending emails, not receiving them. To receive emails from a mail server, you need to use POP3 or IMAP protocol.

**POP3/IMAP protocol** : Both are protocols responsible for receiving emails. IMAP protocol is a newer protocol than POP3, and it is more powerful in terms of functions and performance. IMAP supports advanced functions such as email search, marking, classification, archiving, etc., and can synchronize email status between multiple devices. Almost all modern email clients and servers support IMAP.

**Telnet protocol** : used to log in to other servers through a terminal. One of the biggest disadvantages of Telnet protocol is that all data (including username and password) are sent in clear text, which is a potential security risk. This is the main reason why Telnet is rarely used nowadays, and a very secure network transmission protocol called SSH is used instead.

**SSH protocol** : SSH (Secure Shell) is currently a relatively reliable protocol designed to provide security for remote login sessions and other network services. The use of the SSH protocol can effectively prevent information leakage during remote management. SSH is built on top of the reliable transmission protocol TCP.

...
