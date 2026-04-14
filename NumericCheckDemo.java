public class NumericCheckDemo {
    public static boolean isNumeric(String str) {
        return str.matches("\\d+");
    }

    public static void main(String[] args) {
        System.out.println(isNumeric("12345"));
        System.out.println(isNumeric("12a45"));
    }
}