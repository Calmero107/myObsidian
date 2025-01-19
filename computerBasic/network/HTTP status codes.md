
HTTP status codes are used to describe the results of HTTP requests. For example, 2xx means that the request was successfully processed.

**1xx Informational (information status code)**:
Compared with other status codes, you are unlikely to encounter 1xx in daily life, so just skip it here.

**2xx Success (success status code)**
- **200 OK** : The request was successfully processed. For example, an HTTP request to query user data was sent to the server, and the server correctly returned the user data. This is the most common HTTP status code we usually see.
- **201 Created : The request was successfully processed and** ~~a new resource~~ was created on the server . For example, creating a new user via a POST request.
- **202 Accepted** : The server has received the request but has not yet processed it. For example, a request that takes a long time for the server to process (such as report generation, Excel export) is sent, and the server has received the request but has not yet processed it.
- **204 No Content** : The server has successfully processed the request, but did not return any content. For example, a request was sent to delete a user, and the server successfully processed the deletion operation but did not return any content.

**3xx Redirection**
- **301 Moved Permanently** : The resource has been permanently redirected. For example, the URL of your website has changed.
- **302 Found** : The resource has been temporarily redirected. For example, some resources on your website have been temporarily transferred to another URL.

**4xx Client Error (client error status code)**
- **400 Bad Request** : There is a problem with the HTTP request sent, such as illegal request parameters or incorrect request method.
- **401 Unauthorized** : The request is not authenticated but the resource that needs to be authenticated is requested.
- **403 Forbidden** : Directly reject the HTTP request and do not process it. Generally used for illegal requests.
- **404 Not Found** : The resource you requested was not found on the server. For example, if you requested information about a user, the server did not find the specified user.
- **409 Conflict** : Indicates that the requested resource conflicts with the current state of the server and the request cannot be processed.

**5xx Server Error (server error status code)**
- **500 Internal Server Error** : There is a problem on the server (usually a bug on the server). For example, when your server is processing a request, an exception is thrown, but the exception is not handled correctly on the server.
- **502 Bad Gateway** : Our gateway forwarded the request to the server, but the server returned an error response.