
- Enter the URL of the specified web page in the browser.
- The browser obtains the IP address corresponding to the domain name through the DNS protocol.
- The browser initiates a TCP connection request to the target server based on the IP address and port number.
- The browser sends an HTTP request message to the server over the TCP connection, requesting the content of the web page.
- After receiving the HTTP request message, the server processes the request and returns an HTTP response message to the browser.
- After receiving the HTTP response message, the browser parses the HTML code in the response body, renders the structure and style of the web page, and at the same time, based on the URLs of other resources in the HTML (such as pictures, CSS, JS, etc.), initiates HTTP requests again to obtain the content of these resources until the web page is fully loaded and displayed.
- When the browser does not need to communicate with the server, it can actively close the TCP connection or wait for the server's closing request.
