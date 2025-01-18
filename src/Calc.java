import javax.swing.*;
import java.awt.*;

public class Calc {
  
  public static void main(String[] args) {
  
    //Frame initialization
    JFrame calc = new JFrame("NAFIO Calculator");
    calc.setSize(400, 600);
    calc.setResizable(false); //Ensures users don't break the formatting by resizing the window
    calc.setLayout(null);
    
    //Label initialization
    JLabel label = new JLabel();
    calc.add(label);
    label.setFont(new Font("Lucida Sans Typewriter", Font.PLAIN, 20));
    label.setBounds(30, 50, 300, 50);
    
    //Button initialization from 0-9
    addButton(calc, "0", 30, 500, 250, 50, label);
    addButton(calc, "1", 30, 420, 50, 50, label);
    addButton(calc, "2", 130, 420, 50, 50, label);
    addButton(calc, "3", 230, 420, 50, 50, label);
    addButton(calc, "4", 30, 340, 50, 50, label);
    addButton(calc, "5", 130, 340, 50, 50, label);
    addButton(calc, "6", 230, 340, 50, 50, label);
    addButton(calc, "7", 30, 260, 50, 50, label);
    addButton(calc, "8", 130, 260, 50, 50, label);
    addButton(calc, "9", 230, 260, 50, 50, label);
    
    //Clear button initialization
    
    
    calc.setVisible(true);
    calc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Allows program to close when X'd out
  
  }
  
  public static void addButton(JFrame calc, String key, int x, int y, int width, int height, JLabel label) {
    
    JButton button = new JButton(key);
    calc.add(button);
    button.setBounds(x, y, width, height);
    
    /*if (key.equals("C")) {
      
      button.addActionListener(e -> {
      
      
      
      });
      
    }*/
    
    button.addActionListener(e -> {
      
      String temp = label.getText();
      temp += key;
      label.setText(temp);
      
    });
    
  }
  
}
