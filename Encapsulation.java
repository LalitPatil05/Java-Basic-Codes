class Student {
    int id;
    String name;
    double marks;

    Student(int id,String name,double marks){
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    void display(){
        System.out.println("Student Id is : "+id);
        System.out.println("Student Name is : "+name);
        System.out.println("Student Marks is : "+marks);
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Student obj = new Student(100, "Sumit",90);
        obj.display();
    }
}
