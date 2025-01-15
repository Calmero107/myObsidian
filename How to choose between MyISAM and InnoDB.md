
Most of the time we use the InnoDB storage engine, but in some read-intensive situations, MyISAM is also appropriate, provided that your project does not mind the shortcomings *(khuyết điểm)* of MyISAM such as not supporting transactions and crash recovery (but ~ we usually do mind).

There is a sentence in "MySQL High Performance" that says:
	*Don't easily believe in the saying "MyISAM is faster than InnoDB". This conclusion is often not absolute. In many known scenarios, the speed of InnoDB can make MyISAM far behind, especially when clustered indexes are used or the data to be accessed can be put into memory.*

Therefore, for the business systems we develop daily, you can hardly find any reason to use MyISAM. Just use the default InnoDB!
