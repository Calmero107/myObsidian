
Foreign keys and cascades must not be used. All foreign key concepts must be resolved at the application layer.

Take the relationship between students and grades as an example. The student_id in the student table is the primary key, and the student_id in the grade table is the foreign key. If the student_id in the student table is updated, the student_id in the grade table is also updated, which is a cascade update. Foreign keys and cascade updates are suitable for single machines with low concurrency, but not for distributed and high-concurrency clusters; cascade updates are strongly blocked and there is a ==risk of database update storms==; foreign keys ==affect the insertion speed of the database==.

In fact, we know that foreign keys also have many benefits, such as:
- Ensure the consistency and integrity of database data;
- The cascade operation is convenient and reduces the amount of program code;

Therefore, don't abandon the concept of foreign keys blindly. Since it exists, there must be a reason for its existence. If the system does not involve sharding of libraries and tables, and the concurrency is not very high, you can still consider using foreign keys.