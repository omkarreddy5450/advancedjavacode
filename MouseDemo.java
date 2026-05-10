import java.awt.*;
import java.awt.event.*;

public class MouseDemo extends Frame implements MouseListener {

    Label messageLabel;

    MouseDemo() {

        messageLabel = new Label("Move mouse inside the frame...");
        messageLabel.setAlignment(Label.CENTER);

        setLayout(new FlowLayout());

        add(messageLabel);

        addMouseListener(this);

        setSize(400, 300);

        setTitle("Mouse Event Demo");

        setVisible(true);

        addWindowListener(new WindowAdapter() {

            public void windowClosing(WindowEvent we) {

                dispose();
            }
        });
    }

    public void mouseClicked(MouseEvent e) {

        messageLabel.setText("Mouse Clicked");
    }

    public void mouseEntered(MouseEvent e) {

        messageLabel.setText("Mouse Entered the Frame");
    }

    public void mouseExited(MouseEvent e) {

        messageLabel.setText("Mouse Exited the Frame");
    }

    public void mousePressed(MouseEvent e) {}

    public void mouseReleased(MouseEvent e) {}

    public static void main(String[] args) {

        new MouseDemo();
    }
}