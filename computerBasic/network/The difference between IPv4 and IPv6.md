
**IPv4 (Internet Protocol version 4)** is the most widely used version of IP address, and its format is four groups of numbers separated by dots, for example: 123.89.46.72. IPv4 uses 32-bit addresses as its Internet address, which means there are about 4.2 billion (2^32) available IP addresses.
![[Pasted image 20250109163014.png]]

Of course, ==such a small number is not enough==! In order to solve the problem of IP address exhaustion, the most fundamental way is to adopt a new version of the IP protocol with a larger address space - **IPv6 (Internet Protocol version 6)** . IPv6 addresses use a more complex format that uses a set of numbers and letters separated by single or double colons, for example: 2001:0db8:85a3:0000:0000:8a2e:0370:7334. IPv6 uses 128-bit Internet addresses, which means there are 2^128 (39-bit numbers starting with 3, so scary) available IP addresses.

![[Pasted image 20250109163145.png]]

In addition to a larger address space, the advantages of IPv6 include:
- **Stateless Address Autoconfiguration (SLAAC)** : The host can directly generate a globally unique IPv6 address based on the interface identifier and network prefix without relying on a DHCP (Dynamic Host Configuration Protocol) server, simplifying network configuration and management.
- **NAT (Network Address Translation) becomes optional** : IPv6 address resources are sufficient to give each device in the world an independent address.
- **Improvements to the header structure** : The IPv6 header structure is simpler and more efficient than that of IPv4, which reduces processing overhead and improves network performance.
- **Optional extension headers** : Allows different extension headers to be added to the IPv6 header to implement different types of functions and options.
- **ICMPv6 (Internet Control Message Protocol for IPv6)** : ICMPv6 in IPv6 has some improvements compared to ICMP in IPv4, such as improvements in neighbor discovery, path MTU discovery, and other functions, thereby improving network reliability and performance.
