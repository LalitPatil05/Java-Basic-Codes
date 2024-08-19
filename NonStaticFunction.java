public class NonStaticFunction {
    void MyFunction(){
        System.out.println("Hello MyFunction..!!");
    }
    public static void main(String[] args) {

        NonStaticFunction F1 = new NonStaticFunction();

        F1.MyFunction();
        
    }
}
