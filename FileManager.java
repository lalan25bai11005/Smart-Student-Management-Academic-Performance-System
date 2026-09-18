import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileManager {

    private static final String FILE_NAME = "student_records.txt";

    private FileManager() {
        // Utility class
    }

    public static void saveRecords(ArrayList<Student> students) {

        if (students == null || students.isEmpty()) {
            System.out.println("No student records available to save.");
            return;
        }

        try (FileWriter writer = new FileWriter(FILE_NAME)) {

            writer.write("========== STUDENT RECORDS ==========\n\n");

            for (Student student : students) {

                writer.write("Student ID   : " + student.getStudentId() + "\n");
                writer.write("Name         : " + student.getName() + "\n");
                writer.write("Age          : " + student.getAge() + "\n");
                writer.write("Gender       : " + student.getGender() + "\n");
                writer.write("Department   : " + student.getDepartment() + "\n");
                writer.write("Semester     : " + student.getSemester() + "\n");
                writer.write("Email        : " + student.getEmail() + "\n");
                writer.write("Phone        : " + student.getPhone() + "\n");

                Performance performance = student.getPerformance();

                if (performance != null) {

                    writer.write("\n--- Academic Performance ---\n");

                    int[] marks = performance.getMarks();

                    writer.write("Java                    : " + marks[0] + "\n");
                    writer.write("Operating System        : " + marks[1] + "\n");
                    writer.write("Digital Logic           : " + marks[2] + "\n");
                    writer.write("Data Structures         : " + marks[3] + "\n");
                    writer.write("Computer Organization   : " + marks[4] + "\n");

                    writer.write(String.format(
                            "Average                 : %.2f%%%n",
                            performance.getAverage()
                    ));

                    writer.write(String.format(
                            "Attendance              : %.2f%%%n",
                            performance.getAttendance()
                    ));

                    writer.write("Grade                   : "
                            + performance.getGrade() + "\n");

                    writer.write("Performance Level       : "
                            + performance.getPerformanceLevel() + "\n");
                }

                writer.write("\n------------------------------------------\n\n");
            }

            System.out.println(
                    "Records saved successfully in " + FILE_NAME
            );

        } catch (IOException e) {
            System.out.println(
                    "Error while saving records: " + e.getMessage()
            );
        }
    }

    public static void readRecords() {

        try (BufferedReader reader =
                     new BufferedReader(new FileReader(FILE_NAME))) {

            System.out.println("\n========== SAVED STUDENT RECORDS ==========\n");

            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {

            System.out.println(
                    "No saved records found or file could not be read."
            );
        }
    }
}
