
![[Pasted image 20250108142621.png]]

**IP (Internet Protocol)** : One of the most important protocols in the TCP/IP protocol, it is a network layer protocol that defines the format of data packets, routes and addresses them so that they ==can be transmitted across the network and reach the correct destination==. Currently, there are two main types of IP protocols, one is the old IPv4, and the other is the newer IPv6. Both protocols are currently in use, but the latter has been proposed to replace the former.

**ARP (Address Resolution Protocol)** : The ARP protocol solves the conversion problem between network layer addresses and link layer addresses. Because an IP datagram always needs to know where the next hop (physical next destination) should go during physical transmission, but the IP address is a logical address, while the MAC address is a physical address. The ARP protocol ==solves some problems in converting IP addresses to MAC addresses.==

**ICMP (Internet Control Message Protocol)** : A protocol used to transmit network status and error messages, often used for network diagnosis and troubleshooting. For example, the Ping tool uses the ICMP protocol to test network connectivity.

**NAT (Network Address Translation)** : The application scenario of NAT protocol is just like its name - Network Address Translation, which is used in the address translation process from the internal network to the external network. Specifically, in a small subnet (local area network, LAN), each host uses the same IP address under the LAN, but outside the LAN, in the wide area network (WAN), a unified IP address is required to identify the location of the LAN on the entire Internet.

**OSPF (Open Shortest Path First)** : An Interior Gateway Protocol (IGP) and a widely used dynamic routing protocol. It is based on a link state algorithm and takes into account factors such as link bandwidth and latency to select the best path.

**RIP (Routing Information Protocol)** : An interior gateway protocol (IGP), also a dynamic routing protocol, based on the distance vector algorithm, uses a fixed number of hops as a metric, and selects the path with the least hops as the best path.

**BGP (Border Gateway Protocol)** : A routing protocol used to exchange Network Layer Reachability Information (NLRI) between routing domains, with high flexibility and scalability.
