// import statements  
import java.awt.*;    
import javax.swing.*;    
    
public class BorderLayoutWithoutRegionExample  
{     
JFrame jframe;    
  
// constructor  
BorderLayoutWithoutRegionExample()  
{     
    jframe = new JFrame();    
        
    JButton btn1 = new JButton("NORTH");    
    JButton btn2 = new JButton("SOUTH");    
    JButton btn3 = new JButton("EAST");   
    JButton btn4 = new JButton("WEST");    
    JButton btn5 = new JButton("CENTER");  
      
    // horizontal gap is 7, and the vertical gap is 7  
    // Since region is not specified, the gaps are of no use  
    jframe.setLayout(new BorderLayout(7, 7));  
      
    // each button covers the whole area  
    // however, the btn5 is the latest button   
    // that is added to the frame; therefore, btn5   
    // is shown  
    jframe.add(btn1);    
    jframe.add(btn2);    
    jframe.add(btn3);  
    jframe.add(btn4);  
    jframe.add(btn5);  
        
    jframe.setSize(300,300);    
    jframe.setVisible(true);    
}    
  
// main method  
public static void main(String argvs[])   
{    
    new BorderLayoutWithoutRegionExample();    
}    
}    