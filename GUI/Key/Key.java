import javax.swing.*; 
import java.awt.event.*; 



public class Key extends JFrame implements KeyListener  

{ 

 

    JLabel l; 

    JTextField t; 

 

    Key()  

   { 

        l = new JLabel("Press any key..."); 

 

        t = new JTextField(); 

 

        add(t); 

        add(l); 

 

        t.addKeyListener(this); 

 

        setTitle("Keyboard Event Demo"); 

        setSize(400, 250); 

        setLayout(null); 

        setVisible(true); 

    } 

 

    public void keyTyped(KeyEvent e)  

    { 

        l.setText("Key Typed: " + e.getKeyChar()); 

    } 

 

    public void keyPressed(KeyEvent e) 

    { 

        l.setText("Key Pressed: " + e.getKeyChar()); 

    } 

 

    public void keyReleased(KeyEvent e) 

    { 

        l.setText("Key Released: " + e.getKeyChar()); 

    } 

 

    public static void main(String[] args) 

    { 

        new Key(); 

    } 

} 

 

 