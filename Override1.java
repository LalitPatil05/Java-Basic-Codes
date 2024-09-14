class A1{
void method(){
System.out.println("I am a Parent Class Method..");
}
}

class A2 extends A1{
void method(){
super.method();
System.out.println("I am a Child Class Method..");
}
}

public class Override1{
public static void main(String args[]){
A2 obj = new A2();
obj.method();
}
}