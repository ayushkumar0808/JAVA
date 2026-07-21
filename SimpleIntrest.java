import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class SimpleIntrest {

    public static void main(String[] args) {
        new Swing();
    }
}

class Swing extends JFrame implements ActionListener
{
    JLabel l1,l2,l3,l4;
    JTextField t1,t2,t3,t4;
    JButton b1;

    Swing(){

        setVisible(true);
        setTitle("Simple intrest");
        setSize(600,400);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        l1=new JLabel("Principal");
        l2=new JLabel("Time");
        l3=new JLabel("Rate");
        l4=new JLabel("Simple Intrest");
        t1=new JTextField(8);
        t2=new JTextField(8);
        t3=new JTextField(8);
        t4=new JTextField(8);
        b1=new JButton("Cal");
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(l4);
        add(t4);
        add(b1);
        b1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        double res= (Double.parseDouble(t1.getText())*Double.parseDouble(t2.getText())*Double.parseDouble(t3.getText()))/100;

        t4.setText(String.valueOf(res));
    }
}
