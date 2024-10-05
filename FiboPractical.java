import java.util.*;
public class FiboPractical {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N;
        int n1=0;
        int n2=1;

        System.out.print("Enter the Range : ");
        N = sc.nextInt();

        System.out.println("Fibonacci Series is : ");

        System.out.print(n1+","+n2);

        for(int i=2;i<=N;i++){
            int n3 = n1+n2;
            System.out.print(","+n3);

            n1=n2;
            n2=n3;
        }
    }
}
