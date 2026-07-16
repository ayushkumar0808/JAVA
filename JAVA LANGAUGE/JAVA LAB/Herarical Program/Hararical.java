import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Hararical extends JFrame implements ActionListener
{
    JLabel l1,l2,l3;
    JTextField f1,f2,f3;
    JButton b1;
    public Hararical()
    {
        setSize(600,400);
        setVisible(true);
        setTitle("mine");
        l1=new JLabel("Number1");
        l2=new JLabel("Number2");
        l3=new JLabel("Number3");
        f1=new JTextField(6);
        f2=new JTextField(6);
        f3=new JTextField(6);
        b1=new JButton("ADD");
        setLayout(new FlowLayout());
        add(l1);
        add(f1);
        add(l2);
        add(f2);
        add(l3);
        add(f3);
        add(b1);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        b1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae)
    {
        
        int s=Integer.parseInt(f1.getText())+Integer.parseInt(f2.getText());
        f3.setText(String.valueOf(s));
    }
    public static void main(String args[])
    {
        new Hararical();
    }
}

   