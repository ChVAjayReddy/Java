package Assignment080126;

import java.util.Scanner;

class  SalesEmployee{
    String EmployeeName;
    int EmployeeId;
    SalesEmployee(String EmployeeName,int EmployeeId){
        this.EmployeeId=EmployeeId;
        this.EmployeeName=EmployeeName;
            }
            void display(){
        System.out.println("Employee Name :"+EmployeeName);
        System.out.println("Employee Id :"+EmployeeId);
            }

}
class PerformanceEmployee extends SalesEmployee{
    int noofSales=0;
    int totalSales=0;
    int averageSales=0;
    int sales=0;
    String PerformanceGrade;
    PerformanceEmployee(String EmployeeName,int EmployeeId){
        super(EmployeeName,EmployeeId);
    }
    void AddSalesEntry(int sales){
        this.sales=sales;
        noofSales++;
    }
    void RecalculatePerformanceResult(){
        this.totalSales+=sales;
    }
    void viewSummary(){
        display();
        System.out.println("totalSales:"+totalSales);
        System.out.println("Average Sales:" +totalSales/noofSales);
        if(totalSales<5000){
            System.out.println("Performance Grade: Average");
        }
        else {
            System.out.println("Performance Grade:Good");
        }
    }
}

public class Employee {
    public  static  void main(String[] args){
        Scanner sc=new Scanner(System.in);
        PerformanceEmployee E1=new PerformanceEmployee("Ajay",123);
        boolean running = true;
        while (running) {
            System.out.println("Provide a menu to perform the following operations:\n"
                    + "1. Add Sales Entry\n"
                    + "2. Recalculate Performance Result\n"
                    + "3. View Performance Summary\n"
                    + "4. Exit the program\n"
                    );
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:

                    int amount = sc.nextInt();
                    E1.AddSalesEntry(amount);
                    break;
                case 2:

                    E1.RecalculatePerformanceResult();
                    break;
                case 3:
                    E1.viewSummary();
                    break;
                case 4:
                    running = false;
                    System.out.println("Program exited.");
                    break;
                default:
                    System.out.println("Enter correct choice");
            }
        }
        sc.close();

    }
}
