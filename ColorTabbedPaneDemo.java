import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class ColorTabbedPaneDemo extends JFrame {
    JTabbedPane tabbedPane;

    public ColorTabbedPaneDemo() {
        tabbedPane = new JTabbedPane();

        tabbedPane.addTab("RED", new JLabel("RED", JLabel.CENTER));
        tabbedPane.addTab("BLUE", new JLabel("BLUE", JLabel.CENTER));
        tabbedPane.addTab("GREEN", new JLabel("GREEN", JLabel.CENTER));

        tabbedPane.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                System.out.println(tabbedPane.getTitleAt(tabbedPane.getSelectedIndex()) + " tab selected");
            }
        });

        add(tabbedPane);
        setTitle("Color Tabs");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ColorTabbedPaneDemo();
    }
}