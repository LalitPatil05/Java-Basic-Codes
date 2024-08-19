public class StaticFunction {
    static void MyFunction(){ //static Function
        System.out.println("Hello MyFunction..!!");
    }    

    public static void main(String args[]){
        System.out.println("MainFunction..!!");
        MyFunction();
    }
}
