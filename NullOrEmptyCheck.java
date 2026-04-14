public class NullOrEmptyCheck {
    public static boolean isNullOrEmpty(String str) {
        return str == null || str.trim().isEmpty();
    }

    public static void main(String[] args) {
        String s = "   ";
        System.out.println(isNullOrEmpty(s));
    }
}