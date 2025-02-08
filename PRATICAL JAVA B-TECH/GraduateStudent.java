// Derived class
public class GraduateStudent extends Student {
    private String thesisTitle;

    public GraduateStudent(String name, int studentId, String thesisTitle) {
        super(name, studentId);  // Call the constructor of the Student class
        this.thesisTitle = thesisTitle;
    }

    public void displayGraduateInfo() {
        displayStudentInfo();  // Call method from Student class
        System.out.println("Thesis Title: " + thesisTitle);
    }
}
