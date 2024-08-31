public class StringAppend {

    public static void main(String[] args) {

    StringBuffer str = new StringBuffer("JavaProgramming");
    int no = 121;
    float fno = 14.5f;
    StringBuffer x = str.append(no);
    StringBuffer y = str.append(fno);

    System.out.println(x);
    System.out.println(y);

    }

    
}
