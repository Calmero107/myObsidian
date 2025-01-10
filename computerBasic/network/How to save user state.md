
HTTP is a stateless protocol that does not save state. That is to say, the HTTP protocol itself does not save the communication state between requests and responses. So how do we save the user state? The existence of the Session mechanism is to solve this problem. The main function of the Session is to record the user's state through the server. A typical scenario is a shopping cart. When you want to add an item to the shopping cart, the system does not know which user is doing it because the HTTP protocol is stateless. After the server creates a specific Session for a specific user, it can identify the user and track the user (generally, the server will save the Session for a certain period of time, and will destroy the Session after the time limit).

There are many ways to save sessions on the server side, the most common ones are memory and database (for example, using the memory database redis to save). Since the session is stored on the server side, how do we implement session tracking? In most cases, we track it by attaching a session ID to the cookie.

**What if cookies are disabled?**
The most common method is to use URL rewriting to append the Session ID directly to the end of the URL path.
