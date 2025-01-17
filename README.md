# JavaLabTasks
classwork
ENCAPSULATION
QUESTION 1
You are tasked with creating a CommissionEmployee class to represent an employee who is paid based
on a percentage of their gross sales. This class will enforce proper encapsulation and include validations
for its fields.
CommissionEmployee Class:
Private fields:
● firstName (String): The employee's first name.
● lastName (String): The employee's last name.
● socialSecurityNumber (String): The employee's social security number.
● grossSales (double): The employee's total gross sales (must be greater than or equal to
0.0).
● commissionRate (double): The percentage of gross sales paid as commission (must be
between 0.0 and 1.0).
Methods:
● Constructor to initialize all fields with proper validations.
● Getters and setters for all fields with the following validations:
○ grossSales: Must be greater than or equal to 0.0. If not, throw an exception.
○ commissionRate: Must be between 0.0 and 1.0. If not, throw an exception.
● earnings() - A method to calculate the employee's earnings based on the formula:
grossSales * commissionRate
Task:
1. Create the CommissionEmployee class as specified above.
2. Write a main method to:
○ Create a CommissionEmployee object.
○ Display the employee's details using the toString() method.
○ Update the employee's grossSales and commissionRate and display the updated
details.
○ Calculate and display the employee's earnings using the earnings() method.
○ Test the validation by trying to set invalid values for grossSales and
commissionRate, and handle exceptions gracefully.


QUESTION 2
You are tasked with implementing a Library Management System using the principles of encapsulation.
The system should manage books and library members. It should allow members to borrow books,
return books, and track book availability.
Private fields
● bookId (String)
● title (String)
● author (String)
● availableCopies (int)
Encapsulated methods:
● Constructor to initialize a book with all attributes.
● Getters and setters for all fields.
● borrowBook() - Decrease the availableCopies by 1 if a copy is available,
otherwise throw an exception.
● returnBook() - Increase the availableCopies by 1.
Member Class:
Private fields:
○ memberId (String)
○ name (String)
○ borrowedBooks (ArrayList<Book>) - List of books borrowed by the member
Encapsulated methods:
○ Constructor to initialize a member with memberId and name.
○ Getters and setters for all fields.
○ borrowBook(Book book) - Allow the member to borrow a book if they haven’t
already borrowed it and the book is available.
○ returnBook(Book book) - Allow the member to return a borrowed book.
Library Class:
Private fields:
○ books (ArrayList<Book>) - List of all books in the library.
○ members (ArrayList<Member>) - List of all members of the library.
Encapsulated methods:
○ Add books to the library.
○ Register new members
○ Search for a book by title or author.
○ Check if a book is available.
○ Allow a member to borrow or return a book.
○ Display all books and their availability.
Task:
1. Implement the classes with encapsulation.
2. Write a main method that:
○ Creates a library with at least 5 books and 3 members.
○ Simulates borrowing and returning books.
