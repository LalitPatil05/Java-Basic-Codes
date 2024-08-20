class Demo{
    private static int x = 5;
    private static int y = 10;

    static void Display(){
        System.out.println(x);
        System.out.println(y);
    }
}

class PDAWO{
    public static void main(String args[]){
        Demo.Display();
    }
}