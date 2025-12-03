package Assignment171125;

public class MyClass {

    boolean isEven(int a){
        if(a%2==0){
            return true;
        }
        if(a%2==1){
            return  false;}
        return false;
    }
    String checkNumber(int a){
        if(a>0) {
            return "positive";
        }
        if(a<0){
            return "Negative";
        }
        if(a==0){
            return "zero";
        }
        return "Not a number";
    }
    String canVote(int a){
        if(a>=18){
            return " Eligible to vote";
        }
        if(a < 18){
            return "Not Eligible to vote";
        }
        return "Not a number";
    }
    int findGreatest(int a,int b){
        if(a>b){
            return a;
        }
        if(a<b){
            return b;
        }
        return findGreatest(a,b-a);

    }
    String isDivisibleby5(int a){
        if(a%5==0){
            return "Divisible by 5";
        }
        return "Not Divisible by 5";
    }
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        System.out.println("is 10 is even ? "+obj.isEven(10));
        System.out.println("check -5  "+obj.checkNumber(-5));
        System.out.println("canVote 20  "+obj.canVote(20));
        System.out.println("findGreatest 10,20  "+obj.findGreatest(10,20));
        System.out.println("isDivisible5 20  "+obj.isDivisibleby5(20));

    }
}
