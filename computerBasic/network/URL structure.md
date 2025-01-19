
![[Pasted image 20250108151814.png]]

Protocol. The URL prefix usually indicates which application layer protocol the URL uses, usually two types - HTTP and HTTPS. Of course, there are some less common prefix headers, such as those used for file transfers `ftp:`.

Domain name. The domain name is the common name for accessing a website. It may also be the IP address of the website. The domain name can be understood as the readable version of the IP address. After all, most people will not choose to remember the IP address of a website.

Port. If the port to access the URL is specified, the port will follow the domain name and be separated by a colon.

Resource path. The resource path follows the domain name (port). `/`Starting from the first one, it indicates the file path indexed from the root directory on the server. The file to be accessed in the above figure is in the root directory of the server `/path/to/myfile.html`. The previous design was that the file was usually physically stored on the server host, but now with the advancement of network technology, the file may not be physically stored on the server host, but may be stored in the cloud, and the file path may also be virtual (following certain rules).

Parameters. Parameters are the parameters that the browser adds to the URL when submitting a request to the server. The server extracts these parameters when parsing the request. Parameters are in the form of key-value pairs `key=value`, and each key-value pair `&`is separated by . The specific meaning of the parameters is related to the specific method of the request operation.

Anchor. As the name implies, an anchor is an anchor on the page to be visited. Most of the pages to be visited are more than one page. If an anchor is specified, the client will locate the anchor when displaying the web page, which is equivalent to a small bookmark. It is worth mentioning that in the URL, the anchor `#`starts with and **is not** sent to the server as part of the request.
