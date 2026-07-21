import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Calculator {
    
    public static void main(String[] args) {
        new Swings();
        
    }
}

class Swings extends JFrame implements ActionListener
{
    JLabel l1,l2,l3;
    JTextField t1,t2,t3;
    JButton b1,b2,b3,b4;
    Swings(){
        setVisible(true);
        setTitle("Calculator");
        setSize(800,400);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        l1= new JLabel("NUM 1");
        l2= new JLabel("NUM 2");
        l3= new JLabel("Result");
        t1=new JTextField(12);
        t2=new JTextField(12);
        t3=new JTextField(12);
        b1=new JButton("ADD");
        b2=new JButton("SUB");
        b3=new JButton("MUL");
        b4=new JButton("DIV");
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){

        int a = Integer.parseInt(t1.getText());
        int b = Integer.parseInt(t2.getText());
        int res = 0;
        if(e.getSource()==b1){
            res= a+b;
            t3.setText(String.valueOf(res));
        }

        else if(e.getSource()==b2){
            res=a-b;
            t3.setText(String.valueOf(res));

        }

        else if (e.getSource()==b3){
            res=a*b;
            t3.setText(String.valueOf(res));
        }

        else if (e.getSource()==b4){
            res=a/b;

            t3.setText(String.valueOf(res));
        }

    }
}
