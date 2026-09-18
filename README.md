# Student Record Management System

A console-based **Student Record Management System** developed using **Core Java and Object-Oriented Programming (OOP)** concepts.

The application allows users to manage student information, maintain academic performance records, calculate grades, monitor attendance, and save records to a text file.

---

## Project Overview

Managing student information manually can be time-consuming and difficult to maintain. This project provides a simple command-line solution for managing student records efficiently.

The system provides a menu-driven interface through which users can:

* Add student records
* View all students
* Search for a student
* Update student information
* Delete student records
* Add or update academic performance
* View performance reports
* Save records to a file
* Read saved records

The project is intentionally developed without a GUI or database so that the focus remains on **Core Java programming and OOP concepts**.

---

## Features

### Student Management

* Add new students
* Prevent duplicate Student IDs
* Display all student records
* Search students by ID
* Update student information
* Delete students with confirmation

### Academic Performance

The system stores marks for:

* Java
* Operating System
* Digital Logic
* Data Structures
* Computer Organization

It automatically calculates:

* Average marks
* Grade
* Performance level
* Attendance status

### Grade Calculation

|  Average | Grade | Performance       |
| -------: | :---: | ----------------- |
|   90–100 |   A+  | Excellent         |
| 80–89.99 |   A   | Very Good         |
| 70–79.99 |   B   | Good              |
| 60–69.99 |   C   | Average           |
| 50–59.99 |   D   | Needs Improvement |
| Below 50 |   F   | Poor              |

An attendance warning is displayed when attendance is below **75%**.

---

## Technologies Used

* Java
* Object-Oriented Programming
* ArrayList
* Arrays
* Exception Handling
* Java I/O
* FileWriter
* FileReader
* BufferedReader
* Scanner
* Command Line Interface

### Project Constraints

* No GUI
* No database
* No external libraries
* Only `.java` files for the application
* Console-based application

---

## Project Structure

```text
Student-Record-Management-System/
│
├── Main.java
├── Student.java
├── StudentManager.java
├── Performance.java
├── FileManager.java
├── statement.md
└── README.md
```

### Java Files

| File                  | Description                                          |
| --------------------- | ---------------------------------------------------- |
| `Main.java`           | Controls the application and displays the main menu  |
| `Student.java`        | Represents a student and stores personal information |
| `StudentManager.java` | Handles student CRUD operations                      |
| `Performance.java`    | Handles marks, attendance, grades and performance    |
| `FileManager.java`    | Handles saving and reading records using files       |

---

## Java Concepts Used

This project demonstrates practical use of:

* Classes and Objects
* Constructors
* Encapsulation
* Access Modifiers
* Methods
* `this` keyword
* Static members
* Arrays
* Enhanced `for` loop
* Conditional statements
* `switch`
* `try-catch`
* Exception handling
* `throw`
* `ArrayList`
* Strings
* Method overriding
* File handling
* Character streams
* Input handling using `Scanner`

---

## How to Run

### Prerequisites

Install the **Java JDK** on your system.

Check the installation using:

```bash
java -version
```

and:

```bash
javac -version
```

### 1. Clone the Repository

```bash
git clone https://github.com/lalan25bai11005/Student-Record-Management-System.git
```

Move into the project directory:

```bash
cd Student-Record-Management-System
```

### 2. Compile the Project

Make sure all five `.java` files are in the same folder.

```bash
javac *.java
```

### 3. Run the Application

```bash
java Main
```

---

## Main Menu

When the application starts, the following menu is displayed:

```text
==============================================
     STUDENT RECORD MANAGEMENT SYSTEM
==============================================

--------------- MAIN MENU ---------------
1.  Add Student
2.  Display All Students
3.  Search Student
4.  Update Student
5.  Delete Student
6.  Add/Update Performance
7.  Display Performance
8.  Save Records to File
9.  Read Records from File
10. Exit
------------------------------------------
```

---

## Example

### Adding a Student

```text
========== ADD STUDENT ==========

Enter Student ID: 101
Enter Name: Rahul
Enter Age: 20
Enter Gender: Male
Enter Department: CSE
Enter Semester: 3
Enter Email: rahul@example.com
Enter Phone: 9876543210

Student added successfully.
```

### Performance Report

```text
==========================================
        STUDENT PERFORMANCE REPORT
==========================================

Student ID   : 101
Name         : Rahul
Department   : CSE
Semester     : 3

-------------- SUBJECT MARKS -------------

Java                    : 85
Operating System        : 90
Digital Logic           : 82
Data Structures         : 88
Computer Organization   : 86

------------------------------------------
Average      : 86.20%
Attendance   : 82.00%
Grade        : A
Performance  : Very Good
Attendance   : Satisfactory
==========================================
```

---

## File Storage

When the **Save Records** option is selected, the application creates:

```text
student_records.txt
```

The file contains student details and, if available, academic performance information.

Example:

```text
========== STUDENT RECORDS ==========

Student ID   : 101
Name         : Rahul
Age          : 20
Gender       : Male
Department   : CSE
Semester     : 3
Email        : rahul@example.com
Phone        : 9876543210

--- Academic Performance ---

Java                    : 85
Operating System        : 90
Digital Logic           : 82
Data Structures         : 88
Computer Organization   : 86
Average                 : 86.20%
Attendance              : 82.00%
Grade                   : A
Performance Level       : Very Good
```

---

## Input Validation

The application handles several invalid-input situations, includ
