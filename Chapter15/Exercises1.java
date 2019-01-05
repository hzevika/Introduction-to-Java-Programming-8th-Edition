package Chapter15;

/**
 *
 * @author Havis
 */

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

class Grid extends JPanel{
    protected void paintComponent(Graphics g){
        
        super.paintComponent(g);
        for (int i = 1; i < 3; i++) {
            g.setColor(Color.red);
            g.drawLine(0, i * (150/3), 200, i * (150/3));
        }
        for (int i = 1; i < 3; i++) {
            g.setColor(Color.blue);
            g.drawLine(i * (200/3),0, i * (200/3), 200);
        }
        
    }
}
public class Exercises1 extends JFrame {
    public Exercises1() {
        add(new Grid());
    }

    public static void main(String[] a) {
        Exercises1 frame = new Exercises1();
        frame.setTitle("Chapter 15 - Exercises 1");
        frame.setSize(210, 195);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);
    }
}