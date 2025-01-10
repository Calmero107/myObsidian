![[Pasted image 20250108163521.png]]

==Asymmetric encryption== (mã hóa bất đối xứng)

![[Pasted image 20250108162621.png]]

The core element of SSL/TLS **is** asymmetric encryption . Asymmetric encryption uses two keys - a public key and a private key. During communication, the private key is kept only by the decryptor, and the public key is known to any sender (encryptor) who wants to communicate with the decryptor. You can imagine a scenario where
	In a certain self-service post office, each communication channel is a mailbox, and each mailbox owner has a sign next to it with a key hanging on it: This is my public key. Please put the letter in my mailbox and lock it with the public key. 
	But the ==public key can only lock, not unlock==. Unlocking can only be done by the owner of the mailbox - because only he keeps the private key.
	In this way, the communication information cannot be intercepted by others, which relies on the confidentiality of the private key.

Asymmetric encryption requires the use of a complex mathematical mechanism to generate public and private keys (cryptography believes that for higher security, it is best not to create your own encryption scheme). The algorithm for generating the public and private key pairs relies on a one-way trapdoor function.
	==One-way function==: Given a one-way function f, it is easy to calculate the output y=f(x) given any input x; however, given an output y, assuming that f(x)=y exists, it is difficult to calculate x based on f.
	==One-way trapdoor function==: A weaker one-way function. Given a one-way trapdoor function f and a trapdoor h, it is easy to calculate the output y=f(x;h) given any input x; and given an output y, assuming there exists f(x;h)=y, it is difficult to calculate x based on f, but x can be derived based on f and h.

....