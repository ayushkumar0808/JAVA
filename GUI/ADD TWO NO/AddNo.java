import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AddNo {
    public static void main(String[] args) {
        new SwingClass();
    }   
}
class SwingClass extends JFrame{
    JLabel l1,l2,l3,l4,l5;
    JTextField t1,t2,t3;
    JButton b1;
    SwingClass(){
        setVisible(true);
        setSize(600,400);
        setTitle("Addition");
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        l1=new JLabel("Num1");
        l2=new JLabel("Num2");
        l3=new JLabel("Num3");
        l4=new JLabel("+");
        l5=new JLabel("=");
        t1=new JTextField(5);
        t2=new JTextField(5);
        t3=new JTextField(5);
        b1=new JButton("ADD");
        add(l1);
        add(t1);
        add(l4);
        add(l2);
        add(t2);
        add(l5);
        add(l3);
        add(t3);
        add(b1);
        ActionListener al=new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                int s=Integer.parseInt(t1.getText()) +Integer.parseInt( t2.getText());
                t3.setText(Integer.toString(s));
            }
            
            
        };
        b1.addActionListener(al);
    }

}
