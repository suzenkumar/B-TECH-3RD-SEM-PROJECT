import java.awt.*;

public class Test1 {
    public static void main(String args[]) {
        // Create a new Frame with a title
        Frame f = new Frame("Programme");
        f.setSize(600, 400);

        // Create a Label
        Label l1 = new Label("Select your Hobbies");

        // Create Checkboxes
        Checkbox c1 = new Checkbox("Cricket");
        Checkbox c2 = new Checkbox("Dancing");
        Checkbox c3 = new Checkbox("Singing");
        Checkbox c4 = new Checkbox("Reading");

        // Set bounds for the label and checkboxes
        l1.setBounds(80, 30, 300, 40);
        c1.setBounds(120, 90, 80, 30);
        c2.setBounds(120, 130, 80, 30);
        c3.setBounds(120, 170, 80, 30);
        c4.setBounds(120, 210, 80, 30);

        // Create Buttons
        Button b = new Button("OK");
        Button b1 = new Button("QUIT");

        // Set bounds for the buttons
        b.setBounds(120, 250, 50, 30);
        b1.setBounds(120, 290, 50, 30);

        // Add components to the frame
        f.add(l1);
        f.add(c1);
        f.add(c2);
        f.add(c3);
        f.add(c4);
        f.add(b);
        f.add(b1);

        // Set layout to null for absolute positioning
        f.setLayout(null);

        // Make the frame visible
        f.setVisible(true);
    }
}
