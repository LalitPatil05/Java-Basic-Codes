public class OuterClass {

    public int id = 101;

    public class Inner{
        public void print(){
            System.out.println("This is a Content of Innner Class..!!");
        }
    } 

    public void OuterPrint(){
        Inner obj = new Inner();
        obj.print();
    }
    
    public static void main(String[] args) {
        OuterClass obj = new OuterClass();
        obj.OuterPrint();
    }
}
