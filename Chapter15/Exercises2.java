package Chapter15;

/**
 *
 * @author Havis
 */
import java.awt.Graphics;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
        
class OvalButton extends JButton{
    public OvalButton(String str) {
        setText(str);
    }
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawOval(10, 10, 80, 50);
    }
}

public class Exercises2 extends JFrame{

    public Exercises2() {
        JPanel panel = new JPanel(new GridLayout(1, 2));
        OvalButton ob1 = new OvalButton("OK");
        OvalButton ob2 = new OvalButton("CANCEL");
        add(panel);
        panel.add(ob1);
        panel.add(ob2);
    }
    
    public static void main(String[] args) {
        Exercises2 frame = new Exercises2();
        frame.setTitle("Chapter 15 - Exercises 2");
        frame.setSize(200, 100);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);
    }
}
