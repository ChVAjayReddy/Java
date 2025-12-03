package Assinment191125;

public class InsurancePolicy {
    public String calculatePremium(int age, int experience){
        if(age>50 && experience>=10){
            return "Lowest Premium";
        }
        else if((age>=30&&age<50)&&(experience>=5)){
            return "Moderate Premium";

        }
        else if((age>=18&&age<30)&&(experience<5)){
return "Highest Premium";
        }
        else return "Not Eligible for Insurance";
    }
    public static void main(String[] args) {
        System.out.println(new InsurancePolicy().calculatePremium(55, 10));
    }
}
