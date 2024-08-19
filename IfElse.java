import java.util.Scanner;

public class IfElse {
        public static void main(String args[]){
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter the Age : ");
            int age = scanner.nextInt();

            if(age>18){
                System.out.println("Congratulations..!!");
                System.out.println("You are Eligible to Voting..!!");
            }else{
                System.out.println("Sorry..!!");
                System.out.println("You are Not Eligible to Voting..!!");
            }

        }    
}
