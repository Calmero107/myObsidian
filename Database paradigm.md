
There are 3 database paradigms (Chuẩn hóa dữ liệu):

- [[1NF]] (First Normal Form): Attributes cannot be divided any further.
- [[2NF]] (Second Normal Form): Based on 1NF, it eliminates some functional dependencies of non-primary attributes on the code.
- [[3NF]] (Third Normal Form): 3NF is based on 2NF and eliminates the transitive function dependency of non-primary attributes on the code.

Some important concepts:
- **Functional dependency** : If in a table, when the value of attribute (or attribute group) X is determined, the value of attribute Y can be determined, then it can be said that Y is functionally dependent on X, written as X → Y.
- **Partial functional dependency** : If X→Y, and there exists a proper subset X0 of X such that X0→Y, then Y is said to be partially functionally dependent on X. For example, in the student basic information table R, (student number, ID number, name), of course the student number attribute value is unique. In the R relationship, (student number, ID number)->(name), (student number)->(name), (ID number)->(name); so the name is partially functionally dependent on (student number, ID number);
- **Full functional dependency** : In a relationship, if a non-primary attribute data item depends on all keywords, it is called full functional dependency. For example, in the student basic information table R (student number, class, name), suppose different classes have the same student number, and the student numbers in the class cannot be the same. In the R relationship, (student number, class) -> (name), but (student number) -> (name) does not hold, and (class) -> (name) does not hold, so the name is fully functionally dependent on (student number, class);
- **Full functional dependency** : In a relationship, if a non-primary attribute data item depends on all keywords, it is called full functional dependency. For example, in the student basic information table R (student number, class, name), suppose different classes have the same student number, and the student numbers in the class cannot be the same. In the R relationship, (student number, class) -> (name), but (student number) -> (name) does not hold, and (class) -> (name) does not hold, so the name is fully functionally dependent on (student number, class);


