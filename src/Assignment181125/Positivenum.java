package Assignment181125;

import Assignments061125.demo;

public class Positivenum {
    void ispositivenum(int num) {
        if (num > 0 ){
            System.out.println("Positive");
        }
        else  System.out.println("Negative");
    }
    public  static void main(String[] args) {
        Positivenum demo = new Positivenum();
      demo.ispositivenum(-10);
    }
}
