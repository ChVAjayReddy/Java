package Assignment080126;

import java.util.Scanner;

class Staff{
    String staffName;
    int Id;
    String Shift;
    Staff(String staffName,int Id,String Shift){
        this.staffName=staffName;
        this.Id=Id;
        this.Shift=Shift;
    }
}
class DepartmentStaff extends Staff{
    String DepartmentName;
    String ResponsibilityLevel;
    DepartmentStaff(String staffName,int Id,String Shift,String DepartmentName,String ResponsibilityLevel){
        super(staffName,Id,Shift);
        this.DepartmentName=DepartmentName;this.ResponsibilityLevel=ResponsibilityLevel;
    }
    void UpdateResponsibilityLevel(String newResponsibilityLevel){
        if(newResponsibilityLevel == null|| newResponsibilityLevel.isEmpty()){
            System.out.println("Invalid value");

        }
        else {
            this.ResponsibilityLevel=newResponsibilityLevel;
        }
    }
    void UpdateDepartmentName(String newDepartmentName){
        if(newDepartmentName == null|| newDepartmentName.isEmpty()){
            System.out.println("Invalid value");

        }
        else {
            this.DepartmentName=newDepartmentName;
        }

    }
    void StaffProfile(){
        System.out.println("Staff Profile");
        System.out.println("Name :" +staffName+"\n" +"Id"+Id +"\n" +"Shift :" +Shift+"\n"  +"Department Name: "+DepartmentName+"\n" +"ResponsibilityLevel:"+ResponsibilityLevel);
    }

}
public class HotelManagement {
    public static void main(String[] args){
       DepartmentStaff H1= new DepartmentStaff("Ajay",123,"regular","maintance","manager");
        Scanner sc = new Scanner(System.in);
        boolean running = true;
        while (running) {
            System.out.println(
                    " Provide a menu to perform the following operations:\n"+
                            "1.UpdateResponsibilityLevel\n"+
                            "2. UpdateDepartmentName \n"+
                            "3.View Staff Profile Summary \n"+
                            "4. Exit the program \n"
            );
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Update Responsibility Level:");
                    String name = sc.nextLine();
                    H1.UpdateResponsibilityLevel(name);
                    break;
                case 2:
                    String dname = sc.nextLine();
                    H1.UpdateDepartmentName(dname);
                    break;
                case 3:
                   H1.StaffProfile();
                    break;
                case 4:
                    running = false;
                    System.out.println("Program exited.");
                    break;
                default:
                    System.out.println("Enter correct choice");
            }
        }
        sc.close();}
}
