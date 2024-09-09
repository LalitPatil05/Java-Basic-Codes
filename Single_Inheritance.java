// Demonstration of Inheritance in Java........

class Parent{
    Parent(){
        System.out.println("I am Parent class Constructor.");
    }
}

class Child extends Parent{
    Child(){
        System.out.println("I am a Chilld Class Constructor.");
    }
}

public class Inheritance{
    public static void main(String[] args) {
        Child obj = new Child();
    }
}

