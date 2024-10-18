import java.util.Scanner;

public class StaticFun {
    Scanner s = new Scanner(System.in);
    int id;
    String name;
    float fees;
    static float total;
    
    public void getdata(){
        System.out.println("Enter the Student Id : ");
        id = s.nextInt();
        System.out.println("Enter the Student Name : ");
        name = s.next();
        System.out.println("Enter the Student Fees : ");
        fees = s.nextFloat();
        total = total + fees;
    }

    public void Display(){
        System.out.println("Student Id is : "+id);
        System.out.println("Student Name is :"+name);
        System.out.println("Student Fees is : "+fees);
    }
    
    public static void main(String[] args) {
        StaticFun s1 = new StaticFun();
        StaticFun s2 = new StaticFun();
        StaticFun s3 = new StaticFun();
        
        s1.getdata();
        s2.getdata();
        s3.getdata();
        
        s1.Display();
        s2.Display();
        s3.Display();
        
        System.out.println("Total of Fees is  : "+total);
    }
}
