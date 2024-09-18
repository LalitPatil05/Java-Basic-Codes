import java.util.*;
import java.lang.*;
public class Exception {

    private static java.lang.Exception NullPointerException;
    
    public static void main(String[] args)throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        int a,b;
        int c;

        System.out.print("Enter the Value of a : ");
        a = sc.nextInt();

        System.out.print("Enter the Value of b : ");
        b = sc.nextInt();

        try{
            if(b==0){
                
                throw NullPointerException;
            }
            else{
                c = a/b;
                System.out.println("Divison is : "+c);
            }
        }
        catch(NullPointerException e){
            System.out.println("Divison By Zero is Not Possible");
        }
    }
}
