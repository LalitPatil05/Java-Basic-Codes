public class StudentInfo {
    
    int id;
    String name;
    double fees;

    StudentInfo(int i, String n, double f){
        id = i;
        name = n;
        fees = f;
    }

    public void Display(){
        System.out.println("Student id is : "+id);
        System.out.println("Student Name is : "+name);
        System.out.println("Student Fees is : "+fees);
    }
    public static void main(String[] args) {
        StudentInfo s1 = new StudentInfo(101, "A", 1000);
        StudentInfo s2 = new StudentInfo(102, "B", 2000);
        StudentInfo s3 = new StudentInfo(103, "C", 3000);

        s1.Display();
        s2.Display();
        s3.Display();

        System.out.println("Total Fees is : "+(s1.fees+s2.fees+s3.fees));
    }
}
