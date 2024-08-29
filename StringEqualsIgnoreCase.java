public class StringEqualsIgnoreCase {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        String str3 = "Hello";

        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str1.equalsIgnoreCase(str3));
        System.out.println(str2.equalsIgnoreCase(str3));
    }
}
