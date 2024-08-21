class Example{
    private static int x = 5;
    private static int y = 10;

    void Display(){
        System.out.println(x);
        System.out.println(y);
    }
}

class PrivateData{
    public static void main(String args[]){
        Example E1 = new Example();
        E1.Display();
    }
}