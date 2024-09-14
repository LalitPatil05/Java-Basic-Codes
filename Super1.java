class Base{
int a = 10;
}

class Derived extends Base{
int a = 20;
void method(){
System.out.println("Value of Derived CLass a is : "+a);
System.out.println("Value of Base CLass a is : "+super.a);
}
}

public class Super1{
public static void main(String args[]){
Derived obj = new Derived();
obj.method();
}
}