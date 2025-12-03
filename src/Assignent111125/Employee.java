package Assignent111125;

public class Employee {
    double salary;
    String name;
    void  display(Employee e){
        salary=(e.salary)*1.1;
        System.out.println("Name :" +name);
        System.out.println("Salary :"+salary);
    }
    public static void main(String[] args) {
        Employee e=new Employee();
        e.salary=1000;
        e.name="Ajay";
        e.display(e);
    }
}
