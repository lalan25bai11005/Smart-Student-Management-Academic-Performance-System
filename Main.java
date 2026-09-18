import java.util.Scanner;

public class Main {

    private static final Scanner sc = new Scanner(System.in);
    private static final StudentManager manager = new StudentManager();

    public static void main(String[] args) {

        System.out.println("\n==============================================");
        System.out.println("     STUDENT RECORD MANAGEMENT SYSTEM");
        System.out.println("==============================================");

        int choice;

        do {
            displayMenu();
            choice = readChoice();

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
                    System.out.println("\nExiting the system...");
                    System.out.println("Thank you for using Student Record Management System!");
                    break;

                default:
                    System.out.println("\nInvalid choice! Please select 1-10.");
            }

        } while (choice != 10);

        sc.close();
    }

    private static void displayMenu() {

        System.out.println("\n--------------- MAIN MENU ---------------");
        System.out.println("1.  Add Student");
        System.out.println("2.  Display All Students");
        System.out.println("3.  Search Student");
        System.out.println("4.  Update Student");
        System.out.println("5.  Delete Student");
        System.out.println("6.  Add/Update Performance");
        System.out.println("7.  Display Performance");
        System.out.println("8.  Save Records to File");
        System.out.println("9.  Read Records from File");
        System.out.println("10. Exit");
        System.out.println("------------------------------------------");
    }

    private static int readChoice() {

        while (true) {

            System.out.print("Enter your choice: ");

            try {
                int choice = Integer.parseInt(sc.nextLine().trim());

                if (choice >= 1 && choice <= 10) {
                    return choice;
                }

                System.out.println("Please enter a number between 1 and 10.");

            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a number.");
            }
        }
    }
}
