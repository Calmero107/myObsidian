
The DATETIME type has ==no time zone== information, while TIMESTAMP is ==time zone dependent.==

TIMESTAMP only needs ==4 bytes== of storage space, but DATETIME needs ==8 bytes== of storage space. However, this also creates a problem, that the time range represented by Timestamp is smaller.

- DATETIME：1000-01-01 00:00:00 ~ 9999-12-31 23:59:59
- Timestamp：1970-01-01 00:00:01 ~ 2037-12-31 23:59:59
