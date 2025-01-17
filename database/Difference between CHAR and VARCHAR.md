
CHAR and VARCHAR are the most commonly used string types. The main difference between the two is that **CHAR is a fixed-length string, and VARCHAR is a variable-length string.**

==CHAR will be padded with spaces on the right to reach the specified length== when stored, and the spaces will be removed when retrieved; ==VARCHAR needs to use 1 or 2 extra bytes to record the length of the string== when stored, and no processing is required when retrieving.

==CHAR is more suitable for storing strings of shorter or similar lengths==, such as passwords encrypted by the Bcrypt algorithm or MD5 algorithm, and ID card numbers. ==VARCHAR is suitable for storing strings of uncertain or widely varying lengths==, such as user nicknames and article titles.

The M in CHAR(M) and VARCHAR(M) represents the ==maximum number of characters== that can be stored. Regardless of letters, numbers, or Chinese characters, each occupies only one character.