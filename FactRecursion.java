public class FactRecursion {
    
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        else if(n==1){
            return 1;
        }
        return fact(n-1) * n;
    }

    public static void main(String[] args) {
        int Result;
        Result = fact(5);
        System.out.println("Factorial is : "+Result);

    }
}
