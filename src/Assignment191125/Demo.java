package Assignment191125;

public class Demo {
    void task1(int num){
        System.out.println(num>0?"Positive":num<0?"Negative":"Zero");
    }
    void task2(int num1,int num2,int num3  ){
        if(num1>num2 && num2>num3){
            System.out.println(num1);
        }
        else if(num1>num2 && num2<num3){
            System.out.println(num2);

        }
        else if(num1<num2 && num2<num3){
            System.out.println(num3);
        }
    }
    void task3(int year){

        if (year % 400 == 0)
            System.out.println (year + " is a Leap Year");

        else if (year % 4 == 0 && year % 100 != 0)
            System.out.println (year + " is a Leap Year");

        else
            System.out.println (year + " is not a Leap Year");
    }
    void task4(char c){
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I'|| c == 'O' || c == 'U'){
            System.out.println (c + " is vowel");
        }
        else System.out.println (c + " is consonant ");
    }
    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.task1(0);
        demo.task2(1,2,3);
        demo.task3(2024);
        demo.task4('a');

    }
}
