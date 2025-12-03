package Assignment181125;

public class Eligibility {
    String iseligible(int age){
        if(age >= 18){
            return "Eligible";
        }
        else{
            return "Not Eligible";
        }

    }
    public static void main(String[] args) {
      System.out.println(new Eligibility().iseligible(20));
    }
}
