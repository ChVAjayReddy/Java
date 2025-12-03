package Assignment241125;

import java.util.Scanner;

public class Demo {
    void task1(){
        for (int i=1;i<=10;i++){
            System.out.println(i);
        }
    }
    void task2(){
        for (int i=10;i>=1;i--){
            System.out.println(i);
        }
    }
    void task3(){
        for (int i=2;i<=20;i++){
            if(i%2==0){ System.out.println(i);}

        }
    }
    void task4(){
        for (int i=1;i<=15;i++){
            if(i%2==1){ System.out.println(i);}

        }
    }
    void task5(){
        for (int i=5;i<=50;i++){
            System.out.println(i);
            i+=4;
        }
    }
    void task6(){
        String even = "even :";
        String odd = "odd :";
        for (int i=1;i<=100;i++){
            if(i%2==0){
                even+=" ";
                even+=i;}
            else {
                odd+=" ";
                odd+=i;}
        }
        System.out.println(even);
        System.out.println(odd);

    }
    public static void main(String[] args) {
        Demo obj = new Demo();
        System.out.println("Task 1");
        obj.task1();
        System.out.println("Task 2");
        obj.task2();
        System.out.println("Task 3");
        obj.task3();
        System.out.println("Task 4");
        obj.task4();
        System.out.println("Task 5");
        obj.task5();
        obj.task6();
    }
}
