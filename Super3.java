class Base2 {
Base2() {
System.out.println("Base Class Constructor is invoked..");
}
}

class Derived2 extends Base2 {
Derived2(){
super();
System.out.println("Derived Class Constructor is invoked..");
}
}

public class Super3{
public static void main(String args[]) {
Derived2 obj = new Derived2();
}
}