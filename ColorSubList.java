import java.util.ArrayList;
import java.util.List;

public class ColorSubList {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");

        List<String> extracted = colors.subList(0, 2);

        System.out.println("Original ArrayList: " + colors);
        System.out.println("Extracted elements: " + extracted);
    }
}