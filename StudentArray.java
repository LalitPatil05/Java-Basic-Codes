import java.util.*;

public class StudentArray {
    Scanner s = new Scanner(System.in);
    int id;
    String name;
    float fees;
    
    public void getdata(){
        System.out.println("Enter the Student Id : ");
        id = s.nextInt();
        System.out.println("Enter the Student Name : ");
        name = s.next();
        System.out.println("Enter the Student Fees : ");
        fees = s.nextFloat();
        
    }

    public void Display(){
        System.out.println("Student Id is : "+id);
        System.out.println("Student Name is :"+name);
        System.out.println("Student Fees is : "+fees);
    }
    
    public static void main(String[] args) {

       StudentArray s[] = new StudentArray[5]; // Decleration...

        for(int i=0 ; i<5 ; i++){
            s[i] = new StudentArray(); // Initialization....
            s[i].getdata();

        }

        for(int i=0 ; i<5 ; i++){
            s[i].Display();
        }
      
    }
}
