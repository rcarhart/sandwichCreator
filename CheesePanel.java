import javax.swing.*;
import java.awt.*;
public class CheesePanel extends JPanel{
   
   private JRadioButton american;
   private JRadioButton pepperJack;
   private JRadioButton provolone;
   private ButtonGroup bg;
   private final double americanPrice = 2;
   private final double pepperJackPrice = 2.50;
   private final double provolonePrice = 1.50;
   
   public CheesePanel(){
      // set the grid layout
      setLayout(new GridLayout(3,1));
      
      //create the buttons
      american = new JRadioButton("American");
      pepperJack = new JRadioButton("PepperJack");
      provolone = new JRadioButton("Provolon");
      
      //create the button group
      bg = new ButtonGroup();
      
      //add the JButtons to the button group
      bg.add(american);
      bg.add(pepperJack);
      bg.add(provolone);
      
      //create the border
      setBorder(BorderFactory.createTitledBorder("Cheese"));
      
      //add the radio buttons to the panel
      add(american);
      add(pepperJack);
      add(provolone);
   
   }
   
   public double getCheesePrice(){
      double cheesePrice = 0;
      if(american.isSelected()){
         cheesePrice = americanPrice;
      } else if(pepperJack.isSelected()){
         cheesePrice = pepperJackPrice;
      } else if(provolone.isSelected()){
         cheesePrice = provolonePrice;
      }
      return cheesePrice;
   }
}