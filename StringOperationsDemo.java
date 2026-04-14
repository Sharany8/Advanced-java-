public class StringOperationsDemo {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        String str3 = "   Java Programming   ";
        String email = "student@example.com";

        System.out.println("String Creation and Basic Operations:");
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);

        System.out.println("\nLength and Character Access:");
        System.out.println("Length of str1: " + str1.length());
        System.out.println("Character at index 1 in str1: " + str1.charAt(1));

        System.out.println("\nString Comparison:");
        System.out.println("str1 equals str2? " + str1.equals(str2));
        System.out.println("str1 equalsIgnoreCase(\"hello\")? " + str1.equalsIgnoreCase("hello"));

        System.out.println("\nString Searching:");
        System.out.println("Index of 'o' in str1: " + str1.indexOf('o'));
        System.out.println("Does str2 contain 'rl'? " + str2.contains("rl"));

        System.out.println("\nSubstring Operations:");
        System.out.println("Substring of str2 (1, 4): " + str2.substring(1, 4));

        System.out.println("\nString Modification:");
        System.out.println("Replace 'l' with 'x' in str1: " + str1.replace('l', 'x'));
        System.out.println("Uppercase str2: " + str2.toUpperCase());
        System.out.println("Lowercase str2: " + str2.toLowerCase());

        System.out.println("\nWhitespace Handling:");
        System.out.println("Before trim: '" + str3 + "'");
        System.out.println("After trim: '" + str3.trim() + "'");

        System.out.println("\nString Concatenation:");
        String result = str1.concat(" ").concat(str2);
        System.out.println("Concatenated String: " + result);

        System.out.println("\nString Splitting:");
        String sentence = "Java is easy to learn";
        String[] words = sentence.split(" ");
        for (String word : words) {
            System.out.println(word);
        }

        System.out.println("\nStringBuilder Demo:");
        StringBuilder sb = new StringBuilder("Java");
        sb.append(" Programming");
        System.out.println("StringBuilder result: " + sb);

        System.out.println("\nString Formatting:");
        String formatted = String.format("Name: %s, Age: %d", "Sharanya", 20);
        System.out.println(formatted);

        System.out.println("\nValidate Email:");
        if (email.contains("@") && email.startsWith("student") && email.endsWith(".com")) {
            System.out.println("Valid email format");
        } else {
            System.out.println("Invalid email format");
        }
    }
}