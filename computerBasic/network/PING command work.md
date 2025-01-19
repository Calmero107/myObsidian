
PING is based on **the Internet Control Message Protocol (ICMP)** of the network layer . Its main principle is to send and receive ICMP messages on the network.

ICMP messages contain a type field, which is used to identify the type of ICMP message. There are many types of ICMP messages, but they can be roughly(đại khái) divided into two categories:
- **Query message type** : sends a request to the target host and expects a response.
- **Error message type** : Sends error information to the source host to report errors in the network.

The ICMP Echo Request (type 8) and ICMP Echo Reply (type 0) used by PING are query message types.
- The PING command sends an ICMP Echo Request to the target host.
- If the connectivity between the two hosts is normal, the target host will return a corresponding ICMP Echo Reply.