package Assignments061125;

import java.util.Scanner;

public class CarRentalService {
    public static void main(String[] args) {
        Car c1=new Car();
        Car c2=new Car();
        c1.setCarId(1);
        c2.setCarId(2);
        c1.setBrand("BMW");
        c2.setModel("Old G");
        c1.setRentalPricePerDay(5000);
        c2.setRentalPricePerDay(10000);
        c1.setModel("Zen g");
        c2.setBrand("Audi");
        System.out.println(c1.getCarDetails());
        System.out.println(c2.getCarDetails());
    }
}
