public class StringGetByte {
    
    public static void main(String[] args) {
        String str = "Programming";
        byte b[] = new byte[20];
        b = str.getBytes();
        System.out.println(b);
    }
}
