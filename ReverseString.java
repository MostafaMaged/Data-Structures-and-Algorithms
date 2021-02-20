public class ReverseString {

    public static String reverseString(String string) {
        String reversedString = "";

        for (int i = string.length() - 1; i >= 0; i--) {
            reversedString += string.charAt(i);
        }
        return reversedString;
    }

    public static String reverseStringWithStingBuilder(String string) {
        return new StringBuilder(string).reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseString("123456"));
        System.out.println(reverseStringWithStingBuilder("123456"));
    }
}
