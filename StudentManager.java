import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {

    private ArrayList<Student> students;

    public StudentManager() {
        students = new ArrayList<>();
    }

    public void addStudent(Scanner sc) {

        try {
            System.out.print("Enter Student ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            if (findStudent(id) != null) {
                System.out.println("Student ID already exists!");
                return;
            }

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Age: ");
            int age = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Gender: ");
            String gender = sc.nextLine();

            System.out.print("Enter Department: ");
            String department = sc.nextLine();

            System.out.print("Enter Semester: ");
            int semester = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Email: ");
            String email = sc.nextLine();

            System.out.print("Enter Phone: ");
            String phone = sc.nextLine();

            Student student = new Student(
                    id, name, age, gender,
                    department, semester, email, phone
            );

            students.add(student);

            System.out.println("Student added successfully!");

        } catch (Exception e) {
            System.out.println("Invalid input! Student could not be added.");
            sc.nextLine();
        }
    }

    public void displayAllStudents() {

        if (students.isEmpty()) {
            System.out.println("No student records available.");
            return;
        }

        System.out.println("\n========== ALL STUDENTS ==========");

        for (Student student : students) {
            student.displayStudent();
        }
    }

    public void searchStudent(Scanner sc) {

        System.out.print("Enter Student ID to search: ");
        int id = sc.nextInt();
        sc.nextLine();

        Student student = findStudent(id);

        if (student != null) {
            System.out.println("\nStudent Found:");
            student.displayStudent();
        } else {
            System.out.println("Student not found!");
        }
    }

    public void updateStudent(Scanner sc) {

        System.out.print("Enter Student ID to update: ");
        int id = sc.nextInt();
        sc.nextLine();

        Student student = findStudent(id);

        if (student == null) {
            System.out.println("Student not found!");
            return;
        }

        System.out.print("Enter New Name: ");
        student.setName(sc.nextLine());

        System.out.print("Enter New Age: ");
        student.setAge(sc.nextInt());
        sc.nextLine();

        System.out.print("Enter New Gender: ");
        student.setGender(sc.nextLine());

        System.out.print("Enter New Department: ");
        student.setDepartment(sc.nextLine());

        System.out.print("Enter New Semester: ");
        student.setSemester(sc.nextInt());
        sc.nextLine();

        System.out.print("Enter New Email: ");
        student.setEmail(sc.nextLine());

        System.out.print("Enter New Phone: ");
        student.setPhone(sc.nextLine());

        System.out.println("Student record updated successfully!");
    }

    public void deleteStudent(Scanner sc) {

        System.out.print("Enter Student ID to delete: ");
        int id = sc.nextInt();
        sc.nextLine();

        Student student = findStudent(id);

        if (student != null) {
            students.remove(student);
            System.out.println("Student deleted successfully!");
        } else {
            System.out.println("Student not found!");
        }
    }

    private Student findStudent(int id) {

        for (Student student : students) {
            if (student.getStudentId() == id) {
                return student;
            }
        }

        return null;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void addPerformance(Scanner sc) {

        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        Student student = findStudent(id);

        if (student == null) {
            System.out.println("Student not found!");
            return;
        }

        Performance performance = new Performance();

        performance.enterMarks(sc);

        performance.setAttendance(sc);

        student.setPerformance(performance);

        System.out.println("Performance record saved successfully!");
    }

    public void displayPerformance(Scanner sc) {

        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        Student student = findStudent(id);

        if (student == null) {
            System.out.println("Student not found!");
            return;
        }

        if (student.getPerformance() == null) {
            System.out.println("Performance record not available!");
            return;
        }

        student.getPerformance().displayPerformance(student);
    }
}
