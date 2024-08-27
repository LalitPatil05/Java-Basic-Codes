public class InnerMethod {

    public void InnerFunction(){
           class InnerClass{
                public void InnerFun(){
                    System.out.println("Inner Class Function..!!");
            }
            
        }
        InnerClass obj = new InnerClass();
        obj.InnerFun();
    }

    public static void main(String[] args) {
        InnerMethod obj = new InnerMethod();
        obj.InnerFunction();
        
    }
    
}
