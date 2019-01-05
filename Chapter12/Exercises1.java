package Chapter12;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.FlowLayout;

/**
 *
 * @author Havis
 */
class ShowFlowLayout extends JFrame{

    public ShowFlowLayout(){
        setLayout(new FlowLayout());
        
        JPanel p1 = new JPanel();
        p1.add(new JButton("Button 1"));
        p1.add(new JButton("Button 2"));
        p1.add(new JButton("Button 3"));
        
        JPanel p2 = new JPanel();
        p2.add(new JButton("Button 4"));
        p2.add(new JButton("Button 5"));
        p2.add(new JButton("Button 6"));
        
        add(p2,FlowLayout.LEFT);
        add(p1,FlowLayout.LEFT);
    }
    
}
public class Exercises1 {
    public static void main(String[] args) {
        ShowFlowLayout frame = new ShowFlowLayout();
        frame.setTitle("Chapter 12 - Exercises 1");
        frame.setSize(570, 100);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
