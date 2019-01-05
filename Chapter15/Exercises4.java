package Chapter15;

/**
 *
 * @author Havis
 */
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
  
class MultiplicationTable extends JPanel{
    public MultiplicationTable(GridLayout layout) {
        super.setLayout(layout);
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                add(new JLabel(String.valueOf((i*j))));
            }
        }
        super.setBorder(new LineBorder(Color.BLACK, 1));
        
    }
}
public class Exercises4 extends JFrame{
    
    public Exercises4() {
        MultiplicationTable multiplicationTable = new MultiplicationTable(new GridLayout(9, 9));
        JLabel TabelName = new JLabel("Multiplication Tabel");
        JLabel Mp = new JLabel("1 2  3  4  5  6  7  8  9");
        JPanel panel = new JPanel(new GridLayout(2, 1));
        JPanel emptyPanel = new JPanel();
        JPanel emptyPanel2 = new JPanel();
        panel.add(TabelName);
        panel.add(Mp);
        add(panel);
        add(multiplicationTable);
    }
    
    public static void main(String[] args) {
        Exercises4 frame = new Exercises4();
        frame.setTitle("Chapter 15 - Exercises 2");
        frame.setSize(400, 400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);
    }
}
