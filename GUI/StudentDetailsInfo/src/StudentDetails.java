import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class StudentDetails extends JFrame implements ActionListener {
    JTextField id, name, mark1, mark2;
    JButton b;

    StudentDetails() {
        add(new JLabel("Student ID")).setBounds(30, 30, 100, 25);
        id = new JTextField();
        id.setBounds(140, 30, 100, 25);
        add(id);
        add(new JLabel("Name")).setBounds(30, 70, 100, 25);
        name = new JTextField();
        name.setBounds(140, 70, 100, 25);
        add(name);
        add(new JLabel("Mark 1")).setBounds(30, 110, 100, 25);
        mark1 = new JTextField();
        mark1.setBounds(140, 110, 100, 25);
        add(mark1);
        add(new JLabel("Mark 2")).setBounds(30, 150, 100, 25);
        mark2 = new JTextField();
        mark2.setBounds(140, 150, 100, 25);
        add(mark2);
        b = new JButton("Insert");
        b.setBounds(80, 200, 120, 30);
        add(b);
        b.addActionListener(this);
        setLayout(null);
        setSize(300, 300);
        setTitle("Student Details");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root",
                    "####");
            PreparedStatement ps = con.prepareStatement("INSERT INTO students VALUES (?, ?, ?, ?)");
            ps.setInt(1, Integer.parseInt(id.getText()));
            ps.setString(2, name.getText());
            ps.setInt(3, Integer.parseInt(mark1.getText()));
            ps.setString(4, mark2.getText());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(this, "Student details inserted successfully!");
            con.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }

    public static void main(String[] args) {
        new StudentDetails();
    }
}