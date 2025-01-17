import javax.swing.*;
import java.awt.*;

public class Calc {
  
  public static void main(String[] args) {
  
    //Frame initialization
    JFrame calc = new JFrame("NAFIO Calculator");
    calc.setSize(400, 600);
    calc.setResizable(false); //Ensures users don't break the formatting by resizing the window
    calc.setLayout(null);
    
    //Button initialization from 0-9
    addButton(calc, "0", 30, 500, 250, 50);
    addButton(calc, "1", 30, 420, 50, 50);
    addButton(calc, "2", 130, 420, 50, 50);
    addButton(calc, "3", 230, 420, 50, 50);
    addButton(calc, "4", 30, 340, 50, 50);
    addButton(calc, "5", 130, 340, 50, 50);
    addButton(calc, "6", 230, 340, 50, 50);
    addButton(calc, "7", 30, 260, 50, 50);
    addButton(calc, "8", 130, 260, 50, 50);
    addButton(calc, "9", 230, 260, 50, 50);
    
    //Text window initialization
    JTextField panel = new JTextField();
    calc.add(panel);
    panel.setBounds(30, 50, 300, 50);
    
    calc.setVisible(true);
    calc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Allows program to close when X'd out
  
  }
  
  public static void addButton(JFrame calc, String label, int x, int y, int width, int height) {
    
    JButton button = new JButton(label);
    calc.add(button);
    button.setBounds(x, y, width, height);
    
  }
  
}
