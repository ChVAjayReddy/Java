package Assignments061125;

public class BankAccountManagement {
    long accountId;
    String accountName;
    double balance;
    public void setAccountIdId(int id) {
        accountId = id;
    }
    public void setAccountNameName(String name) {
        accountName = name;
    }
    public void setBalance(double amount) {
        balance=amount;
    }
    public String getAccontDetails(){
        return "Name "+accountName+"\nAccount Id "+accountId+"\nBalance "+balance;


    }
}
