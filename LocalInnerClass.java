public class LocalInnerClass {
    int id = 101;
   public void InnerMethod(){
        class InnerClass{
            void getfun(){
            System.out.println("This is a InnerClass Method");
            System.out.println("Value is : "+id);
            }
        }    
        InnerClass in = new InnerClass();
        in.getfun();
    }

    public static void main(String[] args) {
        LocalInnerClass obj = new LocalInnerClass();
        obj.InnerMethod();
        
    }

}