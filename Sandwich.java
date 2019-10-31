import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Sandwich extends JFrame{
   private JButton calculate;
   private JButton exit; 
   private ProteinPanel protein;
   private CheesePanel cheese;
   private ToppingsPanel toppings;
   private GreetingPanel greeting;
   private JPanel buttonPanel; 
   
   public Sandwich(){
      //display a title
     setTitle("sandwich Creator");
     
     // specify a close action
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     
     //create the layout
     setLayout(new BorderLayout());

     //create the custom panels
     protein = new ProteinPanel();
     cheese = new CheesePanel();
     toppings = new ToppingsPanel();
     greeting = new GreetingPanel();
     
     //create the button panel
     buildButtonPanel();
     
     //add the components to the content pane
     add(greeting, BorderLayout.NORTH);
     add(protein, BorderLayout.WEST);
     add(cheese, BorderLayout.CENTER);
     add(toppings, BorderLayout.EAST);
     add(buttonPanel, BorderLayout.SOUTH);
     
     // pack the components and display it
     pack();
     setVisible(true);
   }
   
   public void buildButtonPanel(){
     //create the panel for the buttons
     buttonPanel = new JPanel();
     
     // create the buttons
     calculate = new JButton("Calculate");
     exit = new JButton("Exit");
     
     //create the action listener for the buttons
     calculate.addActionListener(new CalculateButtonListener());
     exit.addActionListener(new ExitButtonListener());
     
     //add the buttons to the panel
     buttonPanel.add(calculate);
     buttonPanel.add(exit);
   }
   
   private class CalculateButtonListener implements ActionListener{
      public void actionPerformed(ActionEvent e){
         double total = protein.getProteinCost() + cheese.getCheesePrice();
         //display the total
         JOptionPane.showMessageDialog(null, "Total Cost: $" + total);
      }
   }
   
   private class ExitButtonListener implements ActionListener{
      public void actionPerformed(ActionEvent e){
         System.exit(0);
      }
   }
   
   public static void main(String[] args){
      new Sandwich();
   }
}