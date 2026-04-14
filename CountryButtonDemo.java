import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CountryButtonDemo extends JFrame implements ActionListener {
    JLabel label;
    JButton srilankaBtn, indiaBtn;

    public CountryButtonDemo() {
        setTitle("Country Button Demo");
        setLayout(new FlowLayout());

        srilankaBtn = new JButton("Srilanka");
        indiaBtn = new JButton("India");
        label = new JLabel("Press a button");

        srilankaBtn.addActionListener(this);
        indiaBtn.addActionListener(this);

        add(srilankaBtn);
        add(indiaBtn);
        add(label);

        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == srilankaBtn) {
            label.setText("Srilanka is pressed");
        } else if (e.getSource() == indiaBtn) {
            label.setText("India is pressed");
        }
    }

    public static void main(String[] args) {
        new CountryButtonDemo();
    }
}