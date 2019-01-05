package Chapter12;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;

/**
 *
 * @author Havis
 */
class ShowText extends JFrame{

    public ShowText(){
        setLayout(new GridLayout(4, 1));
        JLabel label1 = new JLabel("Departement of computer science");
        label1.setBorder(new LineBorder(Color.black,1));
        JLabel label2 = new JLabel("School of Computing");
        label2.setBorder(new LineBorder(Color.black,1));
        JLabel label3 = new JLabel("Amstrong Atlantic State University");
        label3.setBorder(new LineBorder(Color.black,1));
        JLabel label4 = new JLabel("Tel: (912) 912 - 6440");
        label4.setBorder(new LineBorder(Color.black,1));
        add(label1);
        add(label2);
        add(label3);
        add(label4);
    }   
}

public class Exercises5 {
    public static void main(String[] args) {
        ShowText frame = new ShowText();
        frame.setTitle("Chapter 12 - Exercises 5");
        frame.setSize(220, 100);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
