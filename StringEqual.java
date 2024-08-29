public class StringEqual {
    public static void main(String[] args) {
        String str1 = "India";
        String str2 = "India";
        String str3 = "INDIA";

        System.out.println(str1.equals(str2));
        System.out.println(str2.equals(str3));
        System.out.println(str1.equalsIgnoreCase(str3));
    }
}
