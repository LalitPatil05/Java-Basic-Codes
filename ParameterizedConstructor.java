public class ParameterizedConstructor{
    public int a;
    public int b;

    ParameterizedConstructor(int x, int y){
        a = x;
        b = y;
    }

    public void Display(){
        System.out.println("Value of a is : "+a);
        System.out.println("Value of b is : "+b);
        System.out.println("Sum is : "+(a+b));
    }

    public static void main(String args[]){
        ParameterizedConstructor obj = new ParameterizedConstructor(1,2);
        obj.Display();
        
    }
}