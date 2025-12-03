public class StudentGreetings {
    String name;
    void greet(){
        System.out.println("Hello ," + name );
    }
    public static  void main(String[] args)
    {
        StudentGreetings s=new StudentGreetings();
        s.name="Ajay";
s.greet();    }
}
