public class StringGetchar {
    public static void main(String[] args) {
        String str = "HelloJava";
        char ch[] = new char[4];
        str.getChars(0, 4, ch, 0);
        System.out.println(ch);
    }
}
