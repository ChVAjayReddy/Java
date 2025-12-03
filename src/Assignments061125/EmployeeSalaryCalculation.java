package Assignments061125;

public class EmployeeSalaryCalculation {
    int employeeId;
    String employeeName;
    int employeesalry;
    void setEmployeeId(int employeeid){
        employeeId=employeeid;
    }
    void setEmployeeName(String employeename){
        employeeName=employeename;
    }
    void setEmployeesalary(int salary){
        employeesalry=salary;
    }
    public String getEmployeeDetails(){
        return " Employee Name :"+employeeName+" Employee Id :"+employeeId+" Employee Salary :"+employeesalry;
    }
}
