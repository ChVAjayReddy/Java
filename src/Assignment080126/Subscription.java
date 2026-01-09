package Assignment080126;

import java.util.Scanner;

class  SubscriptionPlan{
    String SubscriberName;
   String PlanType;
    int PlanCost;
     int PaidAmount;
     String SubscriptionStatus;
     SubscriptionPlan(  String SubscriberName,    String PlanType, int PlanCost, int PaidAmount)
     {
         this.SubscriberName=SubscriberName;
         this.PlanCost=PlanCost;
         this.PlanType=PlanType;
         this.PaidAmount=PaidAmount;
         if(this.PlanCost>1000){
             this.SubscriptionStatus="Activated";
         }
         else{
             this.SubscriptionStatus="Not Activated";
         }
         System.out.println("Profie Created Successfully");
     }
void UpdatePaidAmount(int amount){
         if(amount<0){System.out.println("Enter valid amount");

         }
         else {this.PaidAmount=amount;}
}
void ChangeSubscriptionStatus(){
         if(this.PlanCost>1000){
             this.SubscriptionStatus="Activated";
         }
         else{
             this.SubscriptionStatus="Not Activated";
         }
}
void Summary(){
    System.out.println("Name :" +SubscriberName+"\n" +"Plan type"+PlanType +"\n" +"Plan Cost :" +PlanCost+"\n"  +"Paid Amount: "+PaidAmount+"\n" +"Subscriptin Status:"+SubscriptionStatus);
}
}


public class Subscription {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Subscriber Name");
        String name=sc.nextLine();
        System.out.println("Enter Plan TYpe");
        String type=sc.nextLine();
        System.out.println("Enter plan amount");
       int amount=sc.nextInt();
        SubscriptionPlan s1=new SubscriptionPlan("Ajay",type,1000,amount);


        boolean running = true;
        while (running) {
            System.out.println(
                    " Provide a menu to perform the following operations:\n"+
                            "1.Update Paid Amount\n"+
                            "2. Change Subscription Status\n"+
                            "3.View Subscription Summary \n"+
                            "4. Exit the program \n"
            );
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:

                    int newamount=sc.nextInt();
                   s1.UpdatePaidAmount(newamount);
                    break;
                case 2:

                  s1.ChangeSubscriptionStatus();
                    break;
                case 3:
                    s1.Summary();
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
