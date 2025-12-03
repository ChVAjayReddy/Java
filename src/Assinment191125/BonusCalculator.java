package Assinment191125;

public class BonusCalculator {
    public double calculateBonus(int experience, int rating, double salary){
        if(experience >= 5 && rating<=9){
            return salary*(1.5);
        }
        else if((experience >= 3 && experience<5) && (rating>=7&&rating<9)){
            return salary*(1.3);
        }
        else if((experience >= 1 && experience<3) && (rating>=5&&rating<7)) {
            return salary*(1.1);
            
        }
        else return salary;
    }
    public static void main(String[] args) {
        System.out.println(  new BonusCalculator().calculateBonus(4, 8,10000));
    }
}
