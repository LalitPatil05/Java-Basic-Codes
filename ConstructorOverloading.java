public class ConstructorOverloading{
    public int a;
    public int b;
    public int c;

    ConstructorOverloading(int x){
        a = x;
        System.out.println("First Function is Called..!!");
    }

    ConstructorOverloading(int x, int y){
        a = x;
        b = y;
        System.out.println("Second Function is Called..!!");
    }

    ConstructorOverloading(int x, int y, int z){
        a = x;
        b = y;
        c = z;
        System.out.println("Third Function is Called..!!");
    }

    public void Display(){

        System.out.println("Value of a is : "+a);
        System.out.println("Value of b is : "+b);
        System.out.println("Value of c is : "+c);
        
    }

    public static void main(String args[]){

        ConstructorOverloading obj = new ConstructorOverloading(1);
        obj.Display();
        ConstructorOverloading obj2 = new ConstructorOverloading(1,2);
        obj2.Display();
        ConstructorOverloading obj3 = new ConstructorOverloading(1,2,3);
        obj3.Display();
    }
}