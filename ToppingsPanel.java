import javax.swing.*;
import java.awt.*;

public class ToppingsPanel extends JPanel{
   
   private JCheckBox lettuce;
   private JCheckBox tomato;
   private JCheckBox onion;
   private JCheckBox bananaPepper;
   private JCheckBox olives;
   
   public ToppingsPanel(){
      //set the layout
      setLayout(new GridLayout(5,1));
      
      //create the checkboxes
      lettuce = new JCheckBox("Lettuce");
      tomato = new JCheckBox("Tomato");
      onion = new JCheckBox("Onion");
      bananaPepper = new JCheckBox("Banana Peppers");
      olives = new JCheckBox("Olives");
      
      //create the border
      setBorder(BorderFactory.createTitledBorder("Toppings"));
      
      // add the checkBoxes to the panel
      add(lettuce);
      add(tomato);
      add(onion);
      add(bananaPepper);
      add(olives);
   
   }
}