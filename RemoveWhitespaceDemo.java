public class RemoveWhitespaceDemo {
    public static String removeWhitespace(String str) {
        return str.replaceAll("\\s+", "");
    }

    public static void main(String[] args) {
        System.out.println(removeWhitespace("Java is fun"));
    }
}