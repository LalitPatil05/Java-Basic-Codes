public abstract class AbstractClass {
    public abstract void method();

    public static void main(String[] args) {
        AbstractClass obj = new AbstractClass() {
            public void method(){
                System.out.println("I am Abstract Method..");
            }
        };

        obj.method();
    }
}
