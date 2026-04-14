import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class CMYTabbedPaneDemo extends JFrame {
    JTabbedPane tabbedPane;

    public CMYTabbedPaneDemo() {
        tabbedPane = new JTabbedPane();

        tabbedPane.addTab("Cyan", new JLabel("Cyan", JLabel.CENTER));
        tabbedPane.addTab("Magenta", new JLabel("Magenta", JLabel.CENTER));
        tabbedPane.addTab("Yellow", new JLabel("Yellow", JLabel.CENTER));

        tabbedPane.addChangeListener(e ->
                System.out.println(tabbedPane.getTitleAt(tabbedPane.getSelectedIndex()) + " tab selected")
        );

        add(tabbedPane);
        setTitle("CMY Tabs");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new CMYTabbedPaneDemo();
    }
}