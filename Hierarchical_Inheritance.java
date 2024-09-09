// Demonstration of Hierarchical Inheritance......

class A{
    A(){
        System.out.println("I am Class A Constructor.");
    }
}
class B extends A{
    B(){
        System.out.println("I am Class B Constructor.");
    }
}

class C extends B{
    C(){
        System.out.println("I am Class C Constructor.");
    }
}

class D extends A{
    D(){
        System.out.println("Class D Constructor.");
    }
}
public class Hierarchical_Inheritance {
    public static void main(String[] args) {
        D obj = new D();
    }
}
