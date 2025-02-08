//java program to demonstrate layout managers
import java.awt.*;

public class progtest {
    public static void main(String args[]) {
        // Create a frame with a title
        Frame f = new Frame("Programme");
        f.setSize(600, 400);

        // Create text fields for username and password
        TextField t1 = new TextField(10); // Username field
        TextField t2 = new TextField(10); // Password field

        // Create labels for username and password
        Label l1 = new Label("User Name");
        Label l3 = new Label("Password");

        // Set bounds for labels and text fields
        l1.setBounds(120, 120, 90, 20);
        l3.setBounds(120, 160, 90, 20);
        t1.setBounds(220, 120, 90, 30);
        t2.setBounds(220, 160, 90, 30);

        // Create buttons for Submit and Reset
        Button b = new Button("Submit");
        Button b1 = new Button("Reset");

        // Set bounds for buttons
        b.setBounds(120, 200, 50, 30);
        b1.setBounds(189, 200, 50, 30);

        // Add components to the frame
        f.add(l1);
        f.add(l3);
        f.add(t1);
        f.add(t2);
        f.add(b);
        f.add(b1);

        // Set the layout to null (absolute positioning)
        f.setLayout(null);

        // Make the frame visible
        f.setVisible(true);
    }
}
