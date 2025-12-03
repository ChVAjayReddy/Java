package Assignment301025;

public class Faculty {
    static String UniversityName;
    String fname;
    String dept;
    void display(){
        System.out.println("University Name: "+UniversityName);
        System.out.println("Faculty name: "+fname);
        System.out.println("Dept: "+dept);
    }
    public static void main(String[] args) {
        Faculty f1 = new Faculty();
        Faculty f2 = new Faculty();
        f1.fname=" Dr. Robert Brown";
        f1.dept="Computer Science";
        UniversityName="Stanford University";
        f2.fname="  Dr. Lisa Green";
        f2.dept="Physics";
        f1.display();
        f2.display();
    }
}
