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
class ShowMyPanelLayout extends JFrame{

    public ShowMyPanelLayout(){
        setLayout(new GridLayout(2, 1));
        
        MyPanel p1 = new MyPanel();
        MyPanel p2 = new MyPanel();
 
        add(p1);
        add(p2);
    }   
}
class MyPanel extends JPanel{

    public MyPanel() {
        setLayout(new GridLayout(1, 3));
        add(new JButton("Button"));
        add(new JButton("Button"));
        add(new JButton("Button"));
    }
    
    
}
public class Exercises4 {
    public static void main(String[] args) {
        ShowMyPanelLayout frame = new ShowMyPanelLayout();
        frame.setTitle("Chapter 12 - Exercises 4");
        frame.setSize(300, 100);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
