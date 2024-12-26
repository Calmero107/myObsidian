
**Tuple** : Tuple is a basic concept in relational databases. A relation is a table, each r==ow in the table== (i.e. each record in the database) is a tuple, and each ==column is an attribute==. In a two-dimensional table, a tuple is also called a row.

**Code** : The code is the attribute that can uniquely identify the entity, corresponding to the column in the table.

**Candidate key** : If the value of an attribute or attribute group in a relation can uniquely identify a tuple, and any or all of its subsets cannot identify it, then the attribute group is called a candidate key. For example, in a student entity, "student number" can uniquely distinguish student entities, and assuming that the attribute combination of "name" and "class" is sufficient to distinguish student entities, then {student number} and {name, class} are both candidate keys.

**Primary key** : Primary key is also called primary key. Primary key is selected from candidate keys. There can be only one primary key in an entity set, but there can be multiple candidate keys.

**Foreign key** : Foreign key is also called foreign key. If an attribute in one relation is the primary key in another relation, then this attribute is a foreign key.

**Primary attributes** : Attributes that appear in candidate keys are called primary attributes. For example, the relationship worker (worker number, ID number, name, gender, department). Obviously, both the work number and ID number can uniquely identify this relationship, so they are both candidate keys. The two attributes of work number and ID number are primary attributes. If the primary key is an attribute group, then the attributes in the attribute group are all primary attributes.

**Non-primary attributes:** Attributes that are not included in any candidate key are called non-primary attributes. For example, in the relationship - student (student number, name, age, gender, class), the primary key is "student number", then the other "name", "age", "gender", "class" can all be called non-primary attributes.
