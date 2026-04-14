public class TruncateDemo {
    public static String truncate(String str, int length) {
        if (str.length() <= length) return str;
        return str.substring(0, length) + "...";
    }

    public static void main(String[] args) {
        System.out.println(truncate("Java programming is interesting", 10));
    }
}