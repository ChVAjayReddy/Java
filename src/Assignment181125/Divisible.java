package Assignment181125;

public class Divisible {
String isDivisible(int number){
    if(number%5==0 && number%11==0){
        return "Divisible by 5 and 11";
    }
    else return "Not divisible by 5 and 11";

}
public static void main(String[] args) {
    System.out.println(new Divisible().isDivisible(54));
}
}
