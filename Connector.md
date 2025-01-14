
Connectors are primarily concerned with authentication and permission-related functions, like a high-level doorman.

It is mainly responsible for user login to the database and user identity authentication, including verification of account password, permissions and other operations. If the user account password is passed, the connector will query all permissions of the user in the permission table. After that, the permission logic judgment in this connection will depend on the permission data read at this time. In other words, ==as long as the connection is not disconnected, the user will not be affected even if the administrator modifies the user's permissions.==
