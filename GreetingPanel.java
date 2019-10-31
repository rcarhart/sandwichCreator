import javax.swing.*;
import java.awt.*;

public class GreetingPanel extends JPanel{

   private JLabel greeting; // reference a greeting
   
   public GreetingPanel(){
      
      greeting = new JLabel("Kelly's Sandwiches");
      add(greeting);
   
   }
}