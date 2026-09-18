import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentManager manager = new StudentManager();

        int choice;

        do {
            System.out.println("\n======================================");
            System.out.println("   STUDENT RECORD MANAGEMENT SYSTEM");
            System.out.println("======================================");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Add/Update Performance");
            System.out.println("7. Display Student Performance");
            System.out.println("8. Save Records to File");
            System.out.println("9. Read Records from File");
            System.out.println("10. Exit");
            System.out.println("======================================");
            System.out.print("Enter your choice: ");

            try {
                choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {

                    case 1:
                        manager.addStudent(sc);
                        break;

                    case 2:
                        manager.displayAllStudents();
                        break;

                    case 3:
                        manager.searchStudent(sc);
                        break;

                    case 4:
                        manager.updateStudent(sc);
                        break;

                    case 5:
                        manager.deleteStudent(sc);
                        break;

                    case 6:
                        manager.addPerformance(sc);
                        break;

                    case 7:
                        manager.displayPerformance(sc);
                        break;

                    case 8:
                        FileManager.saveRecords(manager.getStudents());
                        break;

                    case 9:
                        FileManager.readRecords();
                        break;

                    case 10:
                        System.out.println("\nThank you for using Student Record Management System!");
                        break;

                    default:
                        System.out.println("Invalid choice! Please enter 1-10.");
                }

            } catch (Exception e) {
                System.out.println("Invalid input! Please enter a valid value.");
                sc.nextLine();
                choice = 0;
            }

        } while (choice != 10);

        sc.close();
    }
}
