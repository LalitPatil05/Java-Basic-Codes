import java.lang.Class;
import java.lang.reflect.*;

class SuperDemo{

}

class Demo extends SuperDemo{

    Demo(){
        System.out.println("Default Constructor is invoked..!!");
    }
    void Display(){
        System.out.println("I am a Display Method..!!");
    }
}

public class Reflection {
    public static void main(String[] args) {
        Demo d1 = new Demo();

        Class obj = d1.getClass();

        String Name = obj.getName();

        System.out.println("Name of Class is : "+Name);

        int modifier = obj.getModifiers();

        String Mod = Modifier.toString(modifier);
        System.out.println("Modifier is : "+Mod);

        Class superClass = obj.getSuperclass();
        System.out.println("Name of Super Class is : "+superClass.getName());

    }
}
