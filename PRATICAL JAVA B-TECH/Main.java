// Main class to test multilevel inheritance
public class Main {
    public static void main(String[] args) {
        GraduateStudent gradStudent = new GraduateStudent("Alice", 12345, "AI in Healthcare");

        // Display information from all levels of inheritance
        gradStudent.displayGraduateInfo(); // Method from GraduateStudent class
    }
}
