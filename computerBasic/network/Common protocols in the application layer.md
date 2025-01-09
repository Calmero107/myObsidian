
![[Pasted image 20250108115335.png]]

**HTTP (Hypertext Transfer Protocol)** : Based on the TCP protocol, it is a protocol for transmitting hypertext and multimedia content, mainly designed for communication between web browsers and web servers. When we use a browser to browse the web, our web pages are loaded through HTTP requests.

**SMTP (Simple Mail Transfer Protocol)** : Based on the TCP protocol, it is a protocol used to send emails. Note: The SMTP protocol is ==only responsible for sending emails==, not receiving them. To receive emails from a mail server, you need to use the POP3 or IMAP protocol.

**POP3/IMAP (Incoming Mail Protocol)** : Based on the TCP protocol, both are protocols responsible for receiving mail. ==The IMAP protocol is a newer protocol than POP3==, and it is more powerful in terms of functions and performance. IMAP supports advanced functions such as mail search, marking, classification, and archiving, and can synchronize mail status between multiple devices. Almost all modern email clients and servers support IMAP.

**FTP (File Transfer Protocol)** : Based on the TCP protocol, it is a protocol used to transfer files between computers, which can shield the operating system and file storage method. Note: ==FTP is an insecure protocol== because it does ==not encrypt data== during transmission. It is recommended to use ==more secure protocols such as SFTP== when transferring sensitive data.

**Telnet (Remote Login Protocol)** : Based on the TCP protocol, it is used to log in to other servers through a terminal. One of the biggest disadvantages of the Telnet protocol is that all data (including usernames and passwords) are sent in plain text, which is a ==potential security risk==. This is the main reason why Telnet is ==rarely used nowadays==, and a very secure network transmission protocol called ==SSH is used instead==.

**SSH (Secure Shell Protocol)** : Based on the TCP protocol, it implements secure access and file transfer through ==encryption and authentication mechanisms.==

**RTP (Real-time Transport Protocol)** : Usually based on the UDP protocol, but also supports the TCP protocol. It provides end-to-end real-time data transmission functions, but does not include resource reservation and does ==not guarantee the quality of real-time transmission==. These functions are implemented by WebRTC.

**DNS (Domain Name System)** : Based on the UDP protocol, it is used to solve the mapping problem between domain names and IP addresses.