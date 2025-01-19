
![[Pasted image 20250109141849.png]]

**Connection-oriented** : UDP does not need to establish a connection before transmitting data, while TCP provides connection-oriented services, which means that a connection must be established before transmitting data and the connection must be released after the data transmission is completed.

**Is it reliable transmission** ? After receiving the UDP message, the remote host does not need to give any confirmation, and does not guarantee that the data will not be lost or arrive in order. TCP provides reliable transmission services. Before TCP transmits data, there will be a three-way handshake to establish a connection, and when transmitting data, there are confirmation, window, retransmission, and congestion control mechanisms. Data transmitted through the TCP connection is error-free, not lost, not repeated, and arrives in order.

**Is it stateful** ? This corresponds to the "Is it reliable transmission?" mentioned above. TCP transmission is stateful, which means that TCP will record the status of the message it sends, such as whether the message has been sent, received, etc. For this purpose, TCP needs to maintain a complex connection status table. UDP is a stateless service, which means that it does not care about what happens after it is sent ( **this is very bad!** ).

**Transmission efficiency** : Since TCP involves connection, confirmation, and retransmission mechanisms, its transmission efficiency is much lower than that of UDP.

**Transmission form** : TCP is byte stream oriented, UDP is message oriented.

**Header overhead** : The TCP header overhead (20 to 60 bytes) is larger than the UDP header overhead (8 bytes).

**Whether to provide broadcast or multicast services** : TCP only supports point-to-point communication, while UDP supports one-to-one, one-to-many, many-to-one, and many-to-many;