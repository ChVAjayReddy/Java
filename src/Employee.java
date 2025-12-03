public class Employee {
    String employeeName;
    int employeeId;
    int employeeSalary;
    public void addEmployeeDetails(String name, int id, int salary) {
        employeeName = name;
        employeeId = id;
        employeeSalary=salary;
    }
    public String displayDetails() {
        return "Employee Name :"+employeeName+" Employee Id :"+employeeId+" Employee Salary :"+employeeSalary;
    }
    public static void main(String[] args){
        Employee emp1=new Employee();
        emp1.addEmployeeDetails("Ajay",1,10000);
        String result=emp1.displayDetails();
        System.out.println(result);
    }
}
