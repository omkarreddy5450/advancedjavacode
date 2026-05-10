import java.awt.*;
import java.awt.event.*;

public class StudentForm extends Frame implements ActionListener {

    Label lName, lRoll, l1, l2, l3, l4, l5;
    TextField tName, tRoll, t1, t2, t3, t4, t5;
    Button b;

    StudentForm() {

        setLayout(new GridLayout(8, 2, 10, 10));

        lName = new Label("Enter Student Name:");
        lRoll = new Label("Enter Roll Number:");

        l1 = new Label("Enter Marks of JAVA:");
        l2 = new Label("Enter Marks of DBMS:");
        l3 = new Label("Enter Marks of OOP:");
        l4 = new Label("Enter Marks of DA:");
        l5 = new Label("Enter Marks of DSA:");

        tName = new TextField();
        tRoll = new TextField();

        t1 = new TextField();
        t2 = new TextField();
        t3 = new TextField();
        t4 = new TextField();
        t5 = new TextField();

        b = new Button("Submit");

        b.addActionListener(this);

        add(lName); add(tName);
        add(lRoll); add(tRoll);

        add(l1); add(t1);
        add(l2); add(t2);
        add(l3); add(t3);
        add(l4); add(t4);
        add(l5); add(t5);

        add(b);

        setTitle("Student Form");

        setSize(450, 400);

        setVisible(true);

        addWindowListener(new WindowAdapter() {

            public void windowClosing(WindowEvent we) {

                dispose();
            }
        });
    }

    public void actionPerformed(ActionEvent e) {

        String name = tName.getText();
        String roll = tRoll.getText();

        int m1 = Integer.parseInt(t1.getText());
        int m2 = Integer.parseInt(t2.getText());
        int m3 = Integer.parseInt(t3.getText());
        int m4 = Integer.parseInt(t4.getText());
        int m5 = Integer.parseInt(t5.getText());

        int total = m1 + m2 + m3 + m4 + m5;

        double percentage = total / 5.0;

        // Result Window

        Frame resultFrame = new Frame("Student Result");

        resultFrame.setLayout(new GridLayout(5, 1));

        resultFrame.setSize(300, 250);

        resultFrame.add(new Label("Name: " + name));
        resultFrame.add(new Label("Roll No: " + roll));
        resultFrame.add(new Label("Total Marks: " + total));
        resultFrame.add(new Label("Percentage: " + percentage));

        Button okButton = new Button("OK");

        resultFrame.add(okButton);

        okButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                resultFrame.dispose();
            }
        });

        resultFrame.setVisible(true);
    }

    public static void main(String[] args) {

        new StudentForm();
    }
}