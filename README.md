<strong> Digital Library Management </strong> <br>

The main objective of this project is to provide a complete automated Library by digitizing. each and every functionality. Starting from the book-keeping, issuing of books, 
fine generation, advance booking and report generation all will be accomplished under one single project. The project will be a web based project with a database server responsible 
for maintaining every single detall of the Library. It has a very user friendly interface which can easily be operated by any non-technical person.

There are essentially two modules of this software;

* <strong>Admin module:</strong> Admin will have complete control over the system. Admin has permissions to update, delete or modify any existing record or make a new entry
 (books and members).

* <strong>Users:</strong> The normal users enjoy only limited privileges. They have a view access to the books. They can browse through the categories, search
 for a particular book,
 return and issue a book. They are also provided with an email option in case
 of a query. <br>
 <br>


<strong> MySQL (Database Query) </strong> <br>

 CREATE TABLE Books (
    book_id INT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255),
    author VARCHAR(255),
    category VARCHAR(100),
    status VARCHAR(20) DEFAULT 'Available'
);

CREATE TABLE Members (
    member_id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255),
    email VARCHAR(255),
    phone VARCHAR(15),
    address VARCHAR(255)
);

CREATE TABLE Transactions (
    transaction_id INT AUTO_INCREMENT PRIMARY KEY,
    member_id INT,
    book_id INT,
    issue_date DATE,
    return_date DATE,
    fine DECIMAL(10, 2),
    FOREIGN KEY (member_id) REFERENCES Members(member_id),
    FOREIGN KEY (book_id) REFERENCES Books(book_id)
);

CREATE TABLE Admins (
    admin_id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50),
    password VARCHAR(50)
);




