/* write a java program to demonstrate applet Structure and event handling  last pratical|| Exp-23||exp date-28.10.24||*/
import java.awt.*;
import java.awt.event.*;

public class Calculator {
    public static void main(String[] args) {
        Frame f = new Frame("Calculator");
        f.setSize(400, 400);
        f.setLayout(null);

        // Text fields for inputs and result
        TextField t1 = new TextField();
        TextField t2 = new TextField();
        TextField t3 = new TextField();
        t3.setEditable(false); // Result field should not be editable

        // Labels for input and output fields
        Label l1 = new Label("Enter 1st No:");
        Label l2 = new Label("Enter 2nd No:");
        Label l3 = new Label("Result:");

        // Setting bounds for labels and text fields
        l1.setBounds(50, 80, 100, 20);
        l2.setBounds(50, 130, 100, 20);
        l3.setBounds(50, 180, 100, 20);
        t1.setBounds(150, 80, 100, 30);
        t2.setBounds(150, 130, 100, 30);
        t3.setBounds(150, 180, 100, 30);

        // Buttons for operations
        Button addBtn = new Button("Add");
        Button subBtn = new Button("Subtract");
        Button mulBtn = new Button("Multiply");
        Button divBtn = new Button("Divide");
        Button modBtn = new Button("Modulus");
        Button clrBtn = new Button("Clear");

        // Setting bounds for buttons
        addBtn.setBounds(50, 250, 80, 30);
        subBtn.setBounds(150, 250, 80, 30);
        mulBtn.setBounds(50, 300, 80, 30);
        divBtn.setBounds(150, 300, 80, 30);
        modBtn.setBounds(50, 350, 80, 30);
        clrBtn.setBounds(150, 350, 80, 30);

        // Adding components to frame
        f.add(l1); f.add(l2); f.add(l3);
        f.add(t1); f.add(t2); f.add(t3);
        f.add(addBtn); f.add(subBtn); f.add(mulBtn);
        f.add(divBtn); f.add(modBtn); f.add(clrBtn);

        f.setVisible(true);

        // Method to handle arithmetic operations safely
        ActionListener performOperation = (e) -> {
            try {
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());
                Button source = (Button) e.getSource();
                int result = 0;

                switch (source.getLabel()) {
                    case "Add":
                        result = a + b;
                        break;
                    case "Subtract":
                        result = a - b;
                        break;
                    case "Multiply":
                        result = a * b;
                        break;
                    case "Divide":
                        if (b != 0) {
                            result = a / b;
                        } else {
                            t3.setText("Error: Div by 0");
                            return;
                        }
                        break;
                    case "Modulus":
                        result = a % b;
                        break;
                }
                t3.setText(String.valueOf(result));
            } catch (NumberFormatException ex) {
                t3.setText("Error: Invalid Input");
            }
        };

        // Adding event handling for all operation buttons
        addBtn.addActionListener(performOperation);
        subBtn.addActionListener(performOperation);
        mulBtn.addActionListener(performOperation);
        divBtn.addActionListener(performOperation);
        modBtn.addActionListener(performOperation);

        // Event handling for Clear button
        clrBtn.addActionListener(e -> {
            t1.setText("");
            t2.setText("");
            t3.setText("");
        });

        // Adding window closing event
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }
}