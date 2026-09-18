#  Smart Student Management & Academic Performance System

> A modular, console-based Java application for managing student records, courses, academic performance, attendance, and reports.

---

##  Overview

The **Smart Student Management & Academic Performance System** is a pure Java console application designed to simplify the management of student and academic information.

The system provides a structured way to manage students, courses, enrollments, marks, attendance, CGPA, and academic reports. It demonstrates practical implementation of concepts from the **Programming in Java** course, including Object-Oriented Programming, exception handling, multithreading, collections, file I/O, and JDBC.

The project follows a modular architecture with **five Java source files**, where each class has a specific responsibility.

---

##  Key Features

###  Student Management

* Add new students
* View all students
* Search students by ID
* Update student information
* Delete student records
* Activate/deactivate student status

###  Academic Management

* Add and manage courses
* Enroll students in courses
* Enter and update marks
* Record attendance
* Calculate student CGPA
* Manage course credits

###  Reports & Analytics

* Generate individual student reports
* Generate academic reports
* Display top-performing students
* Analyze academic performance
* View attendance information

###  Data Management

* Save application data using Java I/O
* Load previously saved data
* Store and retrieve records using JDBC
* Perform database CRUD operations

### Reliability

* Input validation
* Exception handling
* Invalid input detection
* Duplicate record prevention
* Student/course existence validation

---

##  Technologies Used

| Technology       | Purpose                                |
| ---------------- | -------------------------------------- |
| Java             | Core application development           |
| Java Collections | Managing student and course records    |
| Java I/O         | File-based data storage                |
| Multithreading   | Background academic/report processing  |
| JDBC             | Database connectivity                  |
| MySQL            | Persistent database storage            |
| Git & GitHub     | Version control and project management |

---

##  Project Structure

```text
Smart-Student-Management-System/
│
├── src/
│   └── studentmanagement/
│       ├── Main.java
│       ├── Student.java
│       ├── Course.java
│       ├── StudentService.java
│       └── DatabaseManager.java
│
├── data/
│   └── students.txt
│
├── database/
│   └── schema.sql
│
├── README.md
├── statement.md
└── .gitignore
```

### Java Classes

| File                   | Responsibility                                             |
| ---------------------- | ---------------------------------------------------------- |
| `Main.java`            | Console interface, menus and application flow              |
| `Student.java`         | Student model, attributes and student-related data         |
| `Course.java`          | Course information, marks, credits and attendance          |
| `StudentService.java`  | Core business logic, collections, calculations and reports |
| `DatabaseManager.java` | JDBC connection and database operations                    |

---

##  System Architecture

```text
                  ┌─────────────────────┐
                  │       Main.java     │
                  │   Console Interface │
                  └──────────┬──────────┘
                             │
                             ▼
                  ┌─────────────────────
```
