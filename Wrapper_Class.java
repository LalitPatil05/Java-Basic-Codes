public class Wrapper_Class {
    public static void main(String[] args) {

        //Declare a Wrapper class Data Type..

        Integer a = 10;
        Character ch = 'A';
        Double d = 3.14;
        Short s = 121;
        Byte b = 8;

        //Show the Values of Wrapper Classes 
        //compiler take this value as the String
        System.out.println("Wrapper Classes Values Are : ");
        System.out.println(a+a);
        System.out.println(ch);
        System.out.println(d);
        System.out.println(s);
        System.out.println(b);
        
        int a1 = a;
        char ch1 = ch;
        double d1 = d;
        short s1 = s;
        byte b1 = b;

        //Show the Primitive Values
        System.out.println("Primitive Values Are : ");
        System.out.println(a1+a1);
        System.out.println(ch1);
        System.out.println(d1);
        System.out.println(s1);
        System.out.println(b1);
        
    }
    
}
