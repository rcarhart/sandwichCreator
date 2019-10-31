import javax.swing.*;
import java.awt.*;
public class ProteinPanel extends JPanel{
   
   private JRadioButton chicken;
   private JRadioButton steak;
   private JRadioButton sausage;
   private JRadioButton vegetables;
   private ButtonGroup bg;
   private final double chickenPrice = 5.50;
   private final double steakPrice = 6.50;
   private final double sausagePrice = 5.50;
   private final double vegetablePrice = 4.50;
   
   public ProteinPanel() {    

      //set the layout
      setLayout(new GridLayout(4,1));
      
      //create the radio buttons
      chicken = new JRadioButton("Chicken", true);
      steak = new JRadioButton("Steak");
      sausage = new JRadioButton("Sausage");
      vegetables = new JRadioButton("Vegetables");
      
      //group the radio buttons
      bg = new ButtonGroup();
      bg.add(chicken);
      bg.add(steak);
      bg.add(sausage);
      bg.add(vegetables);
      
      // create the border
      setBorder(BorderFactory.createTitledBorder("Protein"));
      
      // add the radio buttons to the panel
      add(steak);
      add(chicken);
      add(sausage);
      add(vegetables);
      
   }
   
   public double getProteinCost(){
      double proteinCost = 0;
      if(chicken.isSelected()){
         proteinCost = chickenPrice;
      } else if (steak.isSelected()){
         proteinCost = steakPrice;
      } else if (sausage.isSelected()){
         proteinCost = sausagePrice;
      } else if(vegetables.isSelected()){
         proteinCost = vegetablePrice;
      }
      return proteinCost;
   }

}