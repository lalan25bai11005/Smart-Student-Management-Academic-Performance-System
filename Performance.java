import java.util.Scanner;

public class Performance {

    private int[] marks;
    private double attendance;
    private double average;
    private String grade;
    private String performanceLevel;

    private final String[] subjects = {
        "Java",
        "Operating System",
        "Digital Logic",
        "Data Structures",
        "Computer Organization"
    };

    public Performance() {
        marks = new int[5];
    }

    public void enterMarks(Scanner sc) {

        System.out.println("\n========== ENTER MARKS ==========");

        for (int i = 0; i < subjects.length; i++) {

            while (true) {
                try {
                    System.out.print("Enter marks in " + subjects[i] + " (0-100): ");
                    int mark = sc.nextInt();

                    if (mark < 0 || mark > 100) {
                        throw new IllegalArgumentException(
                                "Marks must be between 0 and 100."
                        );
                    }

                    marks[i] = mark;
                    break;

                } catch (IllegalArgumentException e) {
                    System.out.println("Invalid marks: " + e.getMessage());
                }
            }
        }

        calculatePerformance();
    }

    public void setAttendance(Scanner sc) {

        while (true) {
            try {
                System.out.print("Enter attendance percentage (0-100): ");
                double value = sc.nextDouble();

                if (value < 0 || value > 100) {
                    throw new IllegalArgumentException(
                            "Attendance must be between 0 and 100."
                    );
                }

                attendance = value;
                break;

            } catch (IllegalArgumentException e) {
                System.out.println("Invalid attendance: " + e.getMessage());
            }
        }
    }

    public void calculatePerformance() {

        int total = 0;

        for (int mark : marks) {
            total += mark;
        }

        average = total / (double) marks.length;

        if (average >= 90) {
            grade = "A+";
            performanceLevel = "Excellent";
        } else if (average >= 80) {
            grade = "A";
            performanceLevel = "Very Good";
        } else if (average >= 70) {
            grade = "B";
            performanceLevel = "Good";
        } else if (average >= 60) {
            grade = "C";
            performanceLevel = "Average";
        } else if (average >= 50) {
            grade = "D";
            performanceLevel = "Needs Improvement";
        } else {
            grade = "F";
            performanceLevel = "Poor";
        }
    }

    public void displayPerformance(Student student) {

        calculatePerformance();

        System.out.println("\n========================================");
        System.out.println("       STUDENT PERFORMANCE REPORT");
        System.out.println("========================================");

        System.out.println("Student ID   : " + student.getStudentId());
        System.out.println("Name         : " + student.getName());
        System.out.println("Department   : " + student.getDepartment());
        System.out.println("Semester     : " + student.getSemester());

        System.out.println("\n----------- SUBJECT MARKS -------------");

        for (int i = 0; i < subjects.length; i++) {
            System.out.println(subjects[i] + " : " + marks[i]);
        }

        System.out.println("----------------------------------------");
        System.out.println("Average      : " + String.format("%.2f", average) + "%");
        System.out.println("Attendance   : " + attendance + "%");
        System.out.println("Grade        : " + grade);
        System.out.println("Performance  : " + performanceLevel);

        if (attendance < 75) {
            System.out.println("Warning      : Attendance is below 75%!");
        } else {
            System.out.println("Attendance   : Satisfactory");
        }

        System.out.println("========================================");
    }

    public int[] getMarks() {
        return marks;
    }

    public double getAttendance() {
        return attendance;
    }

    public double getAverage() {
        return average;
    }

    public String getGrade() {
        return grade;
    }

    public String getPerformanceLevel() {
        return performanceLevel;
    }
}
