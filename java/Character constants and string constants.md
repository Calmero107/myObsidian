- **Format** : A character constant is a character enclosed in single quotes, and a string constant is 0 or more characters enclosed in double quotes.
- **Meaning** : A character constant is equivalent to an integer value (ASCII value) and can participate in expression operations; a string constant represents an address value (the location where the string is stored in memory).
- **Memory size** : Character constants only take up 2 bytes; string constants take up several bytes.


	// Character constant
	public static final char LETTER_A = 'A'; 
	
	//  String constant
	public static final String GREETING_MESSAGE = "Hello, world!";