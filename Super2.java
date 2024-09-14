class Base1{
int a = 10;
void method(){
System.out.println("I am Base Class Method.."+a);
}
}

class Derived1 extends Base1 {
int a = 20;
void method(){
System.out.println("I am Derived Class Method.."+a);
super.method();
}
}

public class Super2 {
public static void main(String args[]){
Derived1 obj = new Derived1();
obj.method();
}
}