public class StringsetCharAt {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("Kolkatta");
        str.setCharAt(0, 'C');
        System.out.println(str);
    }
}