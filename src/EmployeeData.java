public class EmployeeData {
  String empname;
  String empdesg;
  int empsal;
  int empid;
  void setempname(String empName) {
      empname=empName;
  }
  public String getempname() {
      return empname;
  }
    void setempdesg(String empDesg) {
       empdesg=empDesg;
    }
      public String getempdesg() {
        return empdesg;
    } void setempsal(int empSal) {
        empsal=empSal;
    }
    public int getempsal() {
        return empsal;
    } void setempid(int empId) {
        empid=empId;
    }
    public int getempid() {
        return empid;
    }

  public static void main(String[] args) {
      EmployeeData emp=new EmployeeData();

      emp.setempname("Ajay");
      emp.setempdesg("SE");
      emp.setempsal(50000);
      emp.setempid(1);

      System.out.println("Employee Name : "+emp.getempname());
      System.out.println("Employee Designation : "+emp.getempdesg());
      System.out.println("Employee Salary : "+emp.getempsal());
      System.out.println("Employee Id : "+emp.getempid());


  }
}
