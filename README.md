Digital Library Management <br>

The main objective of this project is to provide a complete automated Library by digitizing. each and every functionality. Starting from the book-keeping, issuing of books, 
fine generation, advance booking and report generation all will be accomplished under one single project. The project will be a web based project with a database server responsible 
for maintaining every single detall of the Library. It has a very user friendly interface which can easily be operated by any non-technical person.

There are essentially two modules of this software;

* Admin module: Admin will have complete control over the system. Admin has permissions to update, delete or modify any existing record or make a new entry
 (books and members).

* Users: The normal users enjoy only limited privileges. They have a view access to the books. They can browse through the categories, search
 for a particular book,
 return and issue a book. They are also provided with an email option in case
 of a query. <br>
 <br>


<strong> MySQL (Database Query) </strong> <br>

 mysql> create database LibraryDM;
Query OK, 1 row affected (0.01 sec)

mysql> use LibraryDM;
Database changed
mysql> create table Books (Book_id int auto_increment primary key, Title varchar(255), Author varchar(255), Category varchar(100), Status varchar(20) Default 'Available');
Query OK, 0 rows affected (0.05 sec)

mysql> create table Members (Member_id int auto_increment primary key, Name varchar(255), Email varchar(255), Phone varchar(15), Address varchar(255));
Query OK, 0 rows affected (0.02 sec)

mysql> create table Transactions (Transaction_id int auto_increment primary key, Member_id int, Book_id int, Issue_date date, Return_date date, Fine decimal(10, 2), foreign key (Member_id) references Members(Member_id), foreign key (Book_id) references Books(Book_id));
Query OK, 0 rows affected (0.12 sec)

mysql> create table Admins (Admin_id int auto_increment primary key, Username varchar(50), Password varchar(50));
Query OK, 0 rows affected (0.03 sec)

mysql> select * from Books;
Empty set (0.15 sec)

mysql> select * from Books;
+---------+---------+--------+----------+-----------+
| Book_id | Title   | Author | Category | Status    |
+---------+---------+--------+----------+-----------+
|       1 | ramayan | ram    | read     | Available |
+---------+---------+--------+----------+-----------+
1 row in set (0.01 sec)


