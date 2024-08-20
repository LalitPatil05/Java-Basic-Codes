class Other{
    void Fun1(){
        System.out.println("Hello Fun1");
    }
    void Fun2(){
        System.out.println("Hello Fun2");
    }

}
public class InstanceClass {
   public static void main(String args[]){
    System.out.println("MainFunction");
    Other O1 = new Other();
    O1.Fun1();
    O1.Fun2();
   }
}
