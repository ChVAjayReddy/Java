package Assignment141125;

public class Student {
    int id;
    int rollno;
    String name;
    void setId(int Id){
        id=Id;
    }
    void setroolno(int No){
        rollno=No;
    }void setName(String Name){
        name=Name;
    }
    int getId(){
        return id;
    }
    int getrolno(){
        return rollno;
    }
    String getName(){
        return name;
    }
    static Student getDetails(int Id,int Rollno,String name){
        Student s=new Student();
        s.setId(Id);
        s.setroolno(Rollno);
        s.setName(name);
        System.out.println(s);
        return s;



        }

}
