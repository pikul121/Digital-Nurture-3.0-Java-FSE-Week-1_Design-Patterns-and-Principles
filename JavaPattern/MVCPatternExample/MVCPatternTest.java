package MVCPatternExample;

// File: MVCPatternTest.java
public class MVCPatternTest {
    public static void main(String[] args) {
        // Create model
        Student model = new Student("1", "John Doe", "A");

        // Create view
        StudentView view = new StudentView();

        // Create controller
        StudentController controller = new StudentController(model, view);

        // Display initial details
        controller.updateView();

        // Update model data through controller
        controller.setStudentName("Jane Smith");
        controller.setStudentGrade("B");

        // Display updated details
        controller.updateView();
    }
}
