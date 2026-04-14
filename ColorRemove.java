import java.util.ArrayList;

public class ColorRemove {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");

        System.out.println("Original ArrayList: " + colors);

        colors.remove(1);
        colors.remove("Blue");

        System.out.println("After removing 2nd element and Blue: " + colors);
    }
}