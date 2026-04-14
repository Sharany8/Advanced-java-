import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class CountryListDemo extends JFrame {
    JList<String> countryList;

    public CountryListDemo() {
        String[] countries = {"USA", "India", "Vietnam", "Canada", "Denmark", "France",
                "Great Britain", "Japan", "Africa", "Greenland", "Singapore"};

        countryList = new JList<>(countries);
        countryList.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    System.out.println("Selected: " + countryList.getSelectedValue());
                }
            }
        });

        add(new JScrollPane(countryList), BorderLayout.CENTER);

        setTitle("Country List");
        setSize(300, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new CountryListDemo();
    }
}