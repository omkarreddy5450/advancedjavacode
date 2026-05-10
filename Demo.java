import java.awt.*;
import java.awt.event.*;

public class Demo extends Frame implements KeyListener {

    TextField t;
    TextArea ta;

    Demo() {

        t = new TextField(20);
        ta = new TextArea(10,30);

        setLayout(new FlowLayout());

        add(t);
        add(ta);

        t.addKeyListener(this);

        setTitle("Key Event Demo");

        setSize(400,300);
        setVisible(true);
    }

    public void keyTyped(KeyEvent e) {

        ta.append("Key Typed\n");
    }

    public void keyPressed(KeyEvent e) {

        ta.append("Key Pressed\n");
    }

    public void keyReleased(KeyEvent e) {

        char c = e.getKeyChar();

        ta.append("Key Released : " + c + "\n");
    }

    public static void main(String args[]) {

        new Demo();
    }
}