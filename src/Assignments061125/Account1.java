package Assignments061125;

import java.util.Scanner;

public class Account1 {
    public static void main(String[] args) {
       BankAccountManagement a1=new BankAccountManagement();
        a1.setAccountIdId(1);
        a1.setAccountNameName("Ajay");
        a1.setBalance(10000);
       System.out.println(a1.getAccontDetails());
       System.out.println("------Update Balance-----");
        a1.setBalance(20000);
        System.out.println(a1.getAccontDetails());

    }
}
