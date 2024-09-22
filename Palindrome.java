import java.util.*;

public class Palindrome {
   
	static int PalindromeCheck(int n)
	{
		int reversed_n = 0;
		while (n > 0) {
			reversed_n = reversed_n * 10 + n % 10;
			n = n / 10;
		}
		return reversed_n;
	}

	// Main function
	public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);

		int n;

        System.out.print("Enter the Number :");
        n = sc.nextInt();

		int reverseN = PalindromeCheck(n);
		System.out.println("Reverse of n = " + reverseN);

		// Checking if n is same
		// as reverse of n
		if (n == reverseN)
			System.out.println("Given Number is Palindrome");
		else
			System.out.println("Not a Palindrome");
	}
}
