public class Student {

    private int studentId;
    private String name;
    private int age;
    private String gender;
    private String department;
    private int semester;
    private String email;
    private String phone;

    private Performance performance;

    public Student(int studentId, String name, int age, String gender,
                   String department, int semester,
                   String email, String phone) {

        this.studentId = studentId;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.department = department;
        this.semester = semester;
        this.email = email;
        this.phone = phone;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getDepartment() {
        return department;
    }

    public int getSemester() {
        return semester;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public Performance getPerformance() {
        return performance;
    }

    public void setPerformance(Performance performance) {
        this.performance = performance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void displayStudent() {

        System.out.println("------------------------------------------");
        System.out.println("Student ID   : " + studentId);
        System.out.println("Name         : " + name);
        System.out.println("Age          : " + age);
        System.out.println("Gender       : " + gender);
        System.out.println("Department   : " + department);
        System.out.println("Semester     : " + semester);
        System.out.println("Email        : " + email);
        System.out.println("Phone        : " + phone);
        System.out.println("------------------------------------------");
    }

    @Override
    public String toString() {

        return "Student ID: " + studentId +
               ", Name: " + name +
               ", Department: " + department +
               ", Semester: " + semester;
    }
}
