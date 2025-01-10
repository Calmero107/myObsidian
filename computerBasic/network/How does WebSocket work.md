
The working process of WebSocket can be divided into the following steps:
1. The client ==sends an HTTP request== to the server. The request ==header contains fields such as `Upgrade: websocket`and `Sec-WebSocket-Key`==, indicating that the protocol needs to be upgraded to WebSocket.
2. After receiving this request, the ==server will upgrade the protocol==. If it supports WebSocket, it will ==reply with an HTTP 101 status code==. The response ==header contains fields such `Connection: Upgrade`as and `Sec-WebSocket-Accept: xxx`==, indicating that the upgrade to the WebSocket protocol was successful.
3. A WebSocket ==connection is established== between the client and the server, which allows for bidirectional data transmission. Data is transmitted in the form of frames, and each WebSocket message may be divided into multiple data frames (the smallest unit). The sender will split the message into multiple frames and send them to the receiver. The receiver receives the message frames and reassembles the associated frames into a complete message.
4. The client or server can actively send a close frame to indicate that it wants to disconnect. After receiving it, the other party will also reply with a close frame, and then both parties close the TCP connection.

In addition, after the WebSocket connection is established, the heartbeat mechanism is used to maintain the stability and activity of the WebSocket connection.
