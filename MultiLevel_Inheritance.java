// Demonstration of Single Inheritance.....

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

public class SingleInheritance {
    public static void main(String[] args) {
        C Obj = new C();
    }    
}
