# Student Record Management System

## Project Statement

The **Student Record Management System** is a console-based Java application developed to manage and maintain student academic records efficiently.

The system allows users to add, view, search, update, and delete student information. It also provides functionality to store academic performance, calculate average marks and grades, monitor attendance, and save student records into a text file.

The project is designed using **Core Java and Object-Oriented Programming concepts** and does not require a database or graphical user interface. All operations are performed through a simple command-line menu.

---

## Objectives

The main objectives of this project are:

* To create a simple student record management system using Java.
* To demonstrate practical implementation of Object-Oriented Programming.
* To manage student information using Java collections.
* To calculate and display academic performance.
* To implement exception handling for invalid user inputs.
* To demonstrate file handling using Java I/O streams.
* To provide search, update, and delete functionality.
* To store records permanently in a text file during the program's execution workflow.

---

## Key Features

### 1. Student Management

* Add new student records.
* Display all registered students.
* Search students using Student ID.
* Update existing student information.
* Delete student records with confirmation.

### 2. Academic Performance

* Enter marks for multiple subjects.
* Calculate the student's average marks.
* Automatically assign a grade.
* Display performance level.
* Record attendance percentage.
* Display an attendance warning when attendance is below 75%.

### 3. File Handling

* Save student records to a text file.
* Read previously saved records from the file.
* Uses Java `FileWriter`, `FileReader`, and `BufferedReader`.

### 4. Input Validation

* Handles invalid numerical input.
* Validates age and semester.
* Validates marks between 0 and 100.
* Validates attendance between 0 and 100.
* Prevents duplicate Student IDs.

---

## Technologies Used

* **Programming Language:** Java
* **Java Version:** Compatible with standard modern Java versions
* **Data Structure:** `ArrayList`
* **File Handling:** Java I/O
* **Interface:** Command Line / Console
* **Database:** Not used
* **GUI:** Not used

---

## Project Structure

```text
Student Record Management System
│
├── Main.java
├── Student.java
├── StudentManager.java
├── Performance.java
└── FileManager.java
```

### File Description

| File                  | Purpose                                                               |
| --------------------- | --------------------------------------------------------------------- |
| `Main.java`           | Provides the main menu and controls program execution                 |
| `Student.java`        | Defines the Student class and stores student information              |
| `StudentManager.java` | Handles adding, searching, updating, deleting and managing students   |
| `Performance.java`    | Handles marks, attendance, average, grade and performance calculation |
| `FileManager.java`    | Handles saving and reading student records using files                |

---

## Concepts Demonstrated

This project demonstrates several important Core Java concepts:

* Classes and Objects
* Encapsulation
* Constructors
* Methods
* Access Modifiers
* `this` keyword
* Arrays
* Enhanced `for` loop
* Conditional Statements
* Exception Handling
* `try-catch`
* `throw`
* `ArrayList`
* Static members
* Method overriding
* String handling
* File handling
* `FileWriter`
* `FileReader`
* `BufferedReader`
* Input handling using `Scanner`

---

## Grading System

The system calculates the average marks and assigns a grade according to the following rules:

| Average Marks | Grade | Performance Level |
| ------------: | :---: | ----------------- |
|        90–100 |   A+  | Excellent         |
|      80–89.99 |   A   | Very Good         |
|      70–79.99 |   B   | Good              |
|      60–69.99 |   C   | Average           |
|      50–59.99 |   D   | Needs Improvement |
|      Below 50 |   F   | Poor              |

Attendance below **75%** generates a warning in the performance report.

---

## How to Run

Make sure all five `.java` files are present in the same folder.

### Step 1: Compile

```bash
javac *.java
```

### Step 2: Run

```bash
java Main
```

The application will display a menu similar to:

```text
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

## Sample Workflow

A typical user can perform the following operations:

```text
1. Add Student
       ↓
2. Enter Student Details
       ↓
3. Add Academic Performance
       ↓
4. View Performance Report
       ↓
5. Search / Update / Delete Student
       ↓
6. Save Records to File
       ↓
7. Read Saved Records
```

---

## Limitations

The current version is intentionally designed as a simple Core Java console application.

* It does not use a graphical user interface.
* It does not use a database.
* Records are saved in a text file.
* Saved records are displayed from the file but are not automatically loaded back into the `ArrayList` when the application starts.
* The project is intended for academic learning and demonstration of Java concepts.

---

## Future Enhancements

The project can be extended in the future by adding:

* GUI using Java Swing or JavaFX.
* Database connectivity using JDBC and MySQL.
* User authentication and login.
* Automatic loading of saved records.
* Sorting students by marks, name or Student ID.
* Advanced search and filtering.
* More subjects and customizable subjects.
* Attendance reports.
* Export to CSV or PDF.
* Multithreading for background file operations.
* Admin and student-specific access.

---

## Conclusion

The **Student Record Management System** provides a practical implementation of Core Java concepts through a real-world student management scenario.

By combining **Object-Oriented Programming, collections, exception handling, arrays, strings, and file I/O**, the project demonstrates how Java can be used to build a functional console-based application for managing structured student information and academic performance.
