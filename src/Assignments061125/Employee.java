package Assignments061125;

public class Employee {

    public static void main(String[] args){
        EmployeeSalaryCalculation e = new EmployeeSalaryCalculation();
        e.setEmployeeName("Ajay");
            e.setEmployeeId(1);
            e.setEmployeesalary(100000);
            System.out.println(e.getEmployeeDetails());
            e.setEmployeesalary(200000);
            System.out.println("Updated employee salary");
            System.out.println(e.getEmployeeDetails());
    }
}
