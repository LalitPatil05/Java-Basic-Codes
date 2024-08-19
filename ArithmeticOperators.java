import java.util.Scanner;

public class ArithmeticOperators {
    

public static void main(String args[])
{
    
    Scanner scanner = new Scanner(System.in);

    int a;
    int b;
    int result;

   System.out.print("Enter the value of a : ");
   a = scanner.nextInt();

   System.out.print("Enter the value of b : ");
   b = scanner.nextInt();

    result = a + b;
    System.out.println("The Sum is : "+result);

    result = a - b;
    System.out.println("The Substraction is : "+result);

    result = a * b;
    System.out.println("The Multiplication is : "+result);

    result = a/b;
    System.out.println("The Divison is :"+result);

    result = a % b;
    System.out.println("The Remainder is :"+result);


}
}