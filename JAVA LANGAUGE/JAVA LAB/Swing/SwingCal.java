import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyCal extends JFrame implements ActionListener
{
    JLabel l1,l2,l3;
    JTextField f1,f2,f3;
    JButton b1,b2,b3,b4;
    MyCal()
    {
        setVisible(true);
        setTitle("Calculator");
        setSize(600,400);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        l1=new JLabel("NUM 1");
        l2=new JLabel("NUM 2");
        l3=new JLabel("Result");

        f1=new JTextField(8);
        f2=new JTextField(8);
        f3=new JTextField(8);

        b1=new JButton("ADD");
        b2=new JButton("SUB");
        b3=new JButton("MUL");
        b4=new JButton("DIV");

        add(l1);
        add(f1);
        add(l2);
        add(f2);
        add(l3);
        add(f3);
        add(b1);
        add(b2);
        add(b3);
        add(b4);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
    

    }

    public void actionPerformed(ActionEvent e)
    {

        int a=Integer.parseInt(f1.getText());
        int b=Integer.parseInt(f2.getText());
        int res=0;

        if(e.getSource()==b1)
        {
            res=a+b;
            f3.setText(String.valueOf(res));
        }
        
        else if(e.getSource()==b2)
        {
            res=a-b;
            f3.setText(String.valueOf(res));
        }

        else if(e.getSource()==b3)
        {
            res=a*b;
            f3.setText(String.valueOf(res));
        }

        else if(e.getSource()==b4)
        {
            res=a/b;
            f3.setText(String.valueOf(res));
        }

    }

}


public class SwingCal {

    public static void main(String[] args) {
        new MyCal();
    }
    
}
