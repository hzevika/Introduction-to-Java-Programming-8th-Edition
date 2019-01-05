package Chapter12;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import java.awt.GridLayout;

/**
 *
 * @author Havis
 */
class ShowBorderLayout extends JFrame{

    public ShowBorderLayout(){
        setLayout(new BorderLayout());
        
        JPanel p1 = new JPanel();
        p1.add(new JButton("Button 1"));
        p1.add(new JButton("Button 2"));
        p1.add(new JButton("Button 3"));
        
        JPanel p2 = new JPanel();
        p2.add(new JButton("Button 4"));
        p2.add(new JButton("Button 5"));
        p2.add(new JButton("Button 6"));
 
        add(p1,BorderLayout.SOUTH);
        add(p2,BorderLayout.CENTER);
       
    }
    
}
public class Exercises2 {
    public static void main(String[] args) {
        ShowBorderLayout frame = new ShowBorderLayout();
        frame.setTitle("Chapter 12 - Exercises 2");
        frame.setSize(300, 150);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
