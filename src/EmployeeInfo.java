public class EmployeeInfo {
    String name;
    int age;
    void displayInfo(){
        System.out.println("Employee Name :" + name);
        System.out.println("Age :" + age);
    }
    public static void main(String[] args){
        EmployeeInfo e = new EmployeeInfo();
        e.name="Ajay";
        e.age=23;
        e.displayInfo();


    }
}
