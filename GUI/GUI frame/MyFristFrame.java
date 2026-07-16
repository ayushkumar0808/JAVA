import javax.swing.*;
import java.awt.*;

public class MyFristFrame {
    public static void main(String[] args) {
        new SwingClass();

    }
    
}

class SwingClass extends JFrame{
    SwingClass() {
        setVisible(true);
        setSize(400,400);
        setTitle("AYUSH PAGE");
        JLabel l1=new JLabel("Hello World!! ");
        add(l1);
        JLabel l2=new JLabel("Hi  there!!");
        add(l2);
        JTextField f1=new JTextField(6);
        add(f1);
        JTextArea a1=new JTextArea(3,4);
        add(a1);
        JButton b1=new JButton("Press");
        add(b1);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
