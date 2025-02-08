/**  write a java  program to demonstrate layout manager || Exp22||Exp Date:- 28/10/24||**/
import java.awt.*;

public class Pro5 {
    public static void main(String args[]) {
        Frame f = new Frame("Program");
        f.setSize(600, 400);
        f.setLayout(null);  // Using null layout for custom positioning

        Label l1 = new Label("Select your course");
        l1.setBounds(80, 30, 300, 40);

        Choice c1 = new Choice();
        c1.add("C");
        c1.add("C++");
        c1.add("Java");
        c1.add("C#");
        c1.add("JSP");
        c1.setBounds(120, 90, 150, 30);

        Button b = new Button("OK");
        Button b1 = new Button("Quit");
        b.setBounds(120, 140, 50, 30);
        b1.setBounds(120, 180, 50, 30);

        f.add(l1);
        f.add(c1);
        f.add(b);
        f.add(b1);

        f.setVisible(true);
    }
}
