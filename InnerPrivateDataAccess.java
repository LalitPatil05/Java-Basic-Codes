public class InnerPrivateDataAccess {
    private int id = 220;

    public class Inner{
        public void getdata(){
            System.out.println("Inner Class..");
            System.out.println("Value is : "+id);
        }
    }

    public void Display(){
        Inner obj = new Inner();
        obj.getdata();
    }

    public static void main(String[] args) {
        InnerPrivateDataAccess obj = new InnerPrivateDataAccess();
        obj.Display();
    }
}
