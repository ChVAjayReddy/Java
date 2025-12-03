package Assignent111125;

public class Student {
    int marks;
    String name;
    void details(Student s){
        name=s.name;
        marks=s.marks;
        System.out.println("Name :" +name + "\nMarks :" + marks);
    }
    public static void main(String[] args) {
        Student s=new Student();
        s.marks=92;
        s.name="Ajay";
        s.details(s);
    }
}
