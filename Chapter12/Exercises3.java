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
class ShowGridLayout extends JFrame{

    public ShowGridLayout(){
        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(2, 3));
        p1.add(new JButton("Button 1"));
        p1.add(new JButton("Button 2"));
        p1.add(new JButton("Button 3"));
        p1.add(new JButton("Button 4"));
        p1.add(new JButton("Button 5"));
        p1.add(new JButton("Button 6"));
 
        add(p1);
    }
    
}
public class Exercises3 {
    public static void main(String[] args) {
        ShowGridLayout frame = new ShowGridLayout();
        frame.setTitle("Chapter 12 - Exercises 3");
        frame.setSize(300, 150);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
