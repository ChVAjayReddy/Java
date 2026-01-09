package Assignment080126;
import java.util.Scanner;
class InsurancePolicy{
    String CustomerName;
    String PolicyType;
    int PolicyAmount;
   int ApprovedAmount;
   String PolicyStatus;
   InsurancePolicy( String CustomerName,String PolicyType,int PolicyAmount,int ApprovedAmount,String PolicyStatus){
       this.CustomerName=CustomerName;
       this.PolicyType=PolicyType;
       this.PolicyAmount=PolicyAmount;
       this.ApprovedAmount=ApprovedAmount;
       this.PolicyStatus=PolicyStatus;

   }
   void UpdateApprovedAmount(int ApprovedAmount){
       if(ApprovedAmount<0){
   System.out.println("Invalid amount");}
   else{ this.ApprovedAmount=ApprovedAmount;
   }
   }
   void ChangePolicyStatus(String policyStatus){
       this.PolicyStatus=policyStatus;
   }
   void viewSummary(){
       System.out.println("CustomerName :"+CustomerName);
       System.out.println("PolicyType :"+ PolicyType);
       System.out.println("PolicyAmount :"+PolicyAmount);
       System.out.println(("ApprovedAmount :"+ApprovedAmount));
       System.out.println("PolicyStatus :"+PolicyStatus);
   }
}

public class Insurance {
    public static void main(String[] args){
        InsurancePolicy I1=new InsurancePolicy("Ajay","Health",10000,100000,"Approved");
        Scanner sc = new Scanner(System.in);
        boolean running = true;
        while (running) {
            System.out.println(
                   " Provide a menu to perform the following operations:\n"+
                           "1.Update Approved Amount\n"+
                    "2. Change Policy Status \n"+
            "3.View Policy Summary \n"+
           "4. Exit the program \n"
            );
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Update Approved Amount:");
                    int amount = sc.nextInt();
                    I1.UpdateApprovedAmount(amount);
                    break;
                case 2:
                    String name = sc.nextLine();
                  I1.ChangePolicyStatus(name);
                    break;
                case 3:
                   I1.viewSummary();
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
