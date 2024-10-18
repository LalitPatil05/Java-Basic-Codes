abstract class A{
    abstract public void method();
}

class B extends A{
    public void method(){
        System.out.println("Create a Abstract Class Object Using Referenece of Derived Class");
    }
}
public class AbstractObjectCreate {
    public static void main(String[] args) {
        A obj = new B();
        obj.method();
    }
}
