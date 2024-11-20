Step 1: The Student Class
The Student class is designed to model a student with two fields: name and age. It validates the input during object creation using a constructor.

Key Features:
Fields:
name: Stores the student's name.
age: Stores the student's age.
Constructor:
Validates the name and age using custom exceptions.
If invalid, it throws:
InvalidNameException if the name is null or empty.
InvalidAgeException if the age is not between 18 and 60.
Getters:
getName() and getAge() allow access to the student's details.

