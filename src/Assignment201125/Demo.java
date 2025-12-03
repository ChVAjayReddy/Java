package Assignment201125;

public class Demo {
    void positive(int num){
        System.out.print("Enter a number: ");

        if (num > 0)
            System.out.println("Positive");
        else if (num < 0)
            System.out.println("Negative");
        else
            System.out.println("Zero");

    }
    void largest(int a, int b ,int c){
        if (a >= b && a >= c)
            System.out.println(a + " is largest");
        else if (b >= a && b >= c)
            System.out.println(b + " is largest");
        else
            System.out.println(c + " is largest");
    }
    void isleap(int year){
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))
            System.out.println("Leap Year");
        else
            System.out.println("Not a Leap Year");
    }
    void ischar(char ch){


        if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            System.out.println("Vowel");
        else
            System.out.println("Consonant");
    }
    void isnum(int num){
        if (num % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
    void ispass(int marks){
        if (marks > 35) {
            if (marks > 75)
                System.out.println("Distinction");
            else
                System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }
    void calculator(int x ,int y ,char op) {
        switch (op) {
            case '+':
                System.out.println(x + y);
                break;
            case '-':
                System.out.println(x - y);
                break;
            case '*':
                System.out.println(x * y);
                break;
            case '/':
                if (y != 0) System.out.println(x / y);
                else System.out.println("Cannot divide by zero");
                break;
            default:
                System.out.println("Invalid operator");
        }
    }
    void iseligible(int age){
        if (age >= 18)
            System.out.println("Eligible to vote");
        else
            System.out.println("Not eligible");
    }
    void istemp(int temp){
        if (temp < 0)
            System.out.println("Cold");
        else if (temp <= 20)
            System.out.println("Warm");
        else
            System.out.println("Hot");
    }
    void day(int day){
        switch (day) {
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            case 3: System.out.println("Wednesday"); break;
            case 4: System.out.println("Thursday"); break;
            case 5: System.out.println("Friday"); break;
            case 6: System.out.println("Saturday"); break;
            case 7: System.out.println("Sunday"); break;
            default: System.out.println("Invalid day");
        }
    }
    public static void main(String[] args){
        Demo obj=new Demo();
        obj.positive(8);
        obj.largest(2,5,1);
        obj.isleap(2024);
        obj.ischar('a');
        obj.ispass(45);
        obj.isnum(8);
        obj.calculator(4,5,'+');
        obj.iseligible(16);
        obj.istemp(20);
        obj.day(4);

    }
}
