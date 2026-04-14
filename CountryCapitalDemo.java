import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.util.HashMap;

public class CountryCapitalDemo extends JFrame {
    JList<String> countryList;
    HashMap<String, String> capitals = new HashMap<>();

    public CountryCapitalDemo() {
        String[] countries = {"USA", "India", "Vietnam", "Canada", "Denmark", "France",
                "Great Britain", "Japan", "Africa", "Greenland", "Singapore"};

        capitals.put("USA", "Washington D.C.");
        capitals.put("India", "New Delhi");
        capitals.put("Vietnam", "Hanoi");
        capitals.put("Canada", "Ottawa");
        capitals.put("Denmark", "Copenhagen");
        capitals.put("France", "Paris");
        capitals.put("Great Britain", "London");
        capitals.put("Japan", "Tokyo");
        capitals.put("Africa", "No single capital");
        capitals.put("Greenland", "Nuuk");
        capitals.put("Singapore", "Singapore");

        countryList = new JList<>(countries);
        countryList.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    String country = countryList.getSelectedValue();
                    System.out.println("Capital of " + country + " is " + capitals.get(country));
                }
            }
        });

        add(new JScrollPane(countryList), BorderLayout.CENTER);

        setTitle("Country Capitals");
        setSize(300, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new CountryCapitalDemo();
    }
}