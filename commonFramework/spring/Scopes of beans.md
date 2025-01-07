
Spring định nghĩa 6 kiểu Scope:
- **singleton** : There is only one bean instance in the IoC container. Beans in Spring are singletons by default, which is an application of the singleton design pattern.
	![[Pasted image 20250107150126.png]]
- **prototype** : A new bean instance will be created each time it is retrieved. That is to say, `getBean()`different Bean instances will be obtained for two consecutive times.
	![[Pasted image 20250107150200.png]]
- **request** (only available for Web applications): Each HTTP request will generate a new bean (request bean), which is only valid in the current HTTP request.
	![[Pasted image 20250107150224.png]]
- **session** (only available for Web applications): Each HTTP request from a new session will generate a new bean (session bean), which is only valid within the current HTTP session.
	![[Pasted image 20250107150238.png]]
- **application/global-session** (only available for Web applications): Each Web application creates a bean (application bean) when it starts. The bean is valid only during the startup time of the current application.
	![[Pasted image 20250107150257.png]]
- **websocket** (only available for Web applications): A new bean is created for each WebSocket session.
	![[Pasted image 20250107150320.png]]

**How to configure the scope of beans?**
![[Pasted image 20250107150045.png]]
