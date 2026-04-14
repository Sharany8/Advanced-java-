import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ClockButtonDemo extends JFrame implements ActionListener {
    JLabel label;
    JButton digitalBtn, hourGlassBtn;

    public ClockButtonDemo() {
        setTitle("Clock Button Demo");
        setLayout(new FlowLayout());

        digitalBtn = new JButton("Digital Clock");
        hourGlassBtn = new JButton("Hour Glass");
        label = new JLabel("Press a button");

        digitalBtn.addActionListener(this);
        hourGlassBtn.addActionListener(this);

        add(digitalBtn);
        add(hourGlassBtn);
        add(label);

        setSize(350, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == digitalBtn) {
            label.setText("Digital Clock is pressed");
        } else if (e.getSource() == hourGlassBtn) {
            label.setText("Hour Glass is pressed");
        }
    }

    public static void main(String[] args) {
        new ClockButtonDemo();
    }
}