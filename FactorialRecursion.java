public class FactorialRecursion {

    public static int fact(int n){
        int result;
        if(n==0){
            return 0;
        }
        else if(n==1){
            return  1;
        }

        else{
            result = n * fact(n-1);
            return result;
        }
    }

    public static void main(String[] args) {
        int show = fact(4);
        System.out.println("Result is :"+show);
    }
    
}
