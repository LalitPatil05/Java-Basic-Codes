abstract class AnonymousInner{
    public abstract void method();
}

public class AnoClass {
    public static void main(String[] args) {
        AnonymousInner in = new AnonymousInner() {
            public void method(){
                System.out.println("This is Content of Anonymous Absract Method");
            }
        };
        in.method();
    }
}
