package Assignment141125;

public class Employee {
    int id;
            String name;
                    int salary;
                    void setId(int Id){
                        id=Id;
                    }
                    void setName(String Name){
                        name=Name;
                    }
                    void setSalary(int Salary){
                        salary=Salary;
                    }
                    static Employee getDetails(int Id,String Name,int Salary){
                        Employee e=new Employee();
                        e.setId(Id);
                        e.setName(Name);
                        e.setSalary(Salary);
                        return e;
                    }
}
