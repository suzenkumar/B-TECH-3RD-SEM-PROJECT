// Intermediate class
public class Student extends Person {
    protected int studentId;

    public Student(String name, int studentId) {
        super(name);  // Call the constructor of the Person class
        this.studentId = studentId;
    }

    public void displayStudentInfo() {
        displayInfo();  // Call method from Person class
        System.out.println("Student ID: " + studentId);
    }
}
