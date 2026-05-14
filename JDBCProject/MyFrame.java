package JDBCProject;
import java.awt.*;


public class MyFrame {
    public static void main(String[] args) {

        // Create Frame
        Frame f = new Frame("Basic GUI Example");

        // Create Button
        Button b = new Button("Ok");

        // Set button position and size
        b.setBounds(120, 100, 80, 30);

        // Add button to frame
        f.add(b);

        // Set frame size
        f.setSize(350, 250);

        // Set layout
        f.setLayout(null);

        // Make frame visible
        f.setVisible(true);
    }
}