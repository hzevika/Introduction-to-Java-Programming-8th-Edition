package Chapter15;

/**
 *
 * @author Havis
 */
import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
        
class MyButton extends JButton{
    public MyButton(boolean b) {
        if (b)
            setBackground(Color.BLACK);
        else
            setBackground(Color.WHITE);
    }
}

public class Exercises3 extends JFrame{

    public Exercises3() {
        JPanel panel = new JPanel(new GridLayout(8, 8));
        add(panel);
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if((i+j)%2==0)
                    panel.add(new MyButton(true));
                else
                    panel.add(new MyButton(false));
            }
        }
    }
    
    public static void main(String[] args) {
        Exercises3 frame = new Exercises3();
        frame.setTitle("Chapter 15 - Exercises 3");
        frame.setSize(400, 250);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);
    }
}