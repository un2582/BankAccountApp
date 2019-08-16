package bankaccountapp;

import java.util.Random;

public abstract class Account implements InterestRate {
    //list common properties for savings and checking account
    private String name;
    private String ssn;
    private double balance;
    private String accountNumber;
    private double rate;
    private static int uniqueID = 10000;


    //Constructor to set base properties
    public Account(String name, String ssn, double balance){
        this.name = name;
        this.ssn = ssn;
        this.balance = balance;

        //set account number
        accountNumber = setAccountNumber();
        uniqueID++;
        setBaseRate();

    }
    //List of common methods
    public abstract void setBaseRate();

    public void compound(){
        double accrusedInterest = balance * rate/100;
        balance += accrusedInterest;
        System.out.println("Accrused Interest is: " + accrusedInterest);
        printBalance();
    }

    public void printBalance(){
        System.out.println("Balance is: " + balance);
    }

    public void deposit(double amount){
        balance += amount;
        System.out.println("Depositing amount $" + amount);
        printBalance();
    }

    public void withdraw(double amount){
        balance -= amount;
        System.out.println("Withdrawing amount $" + amount);
        printBalance();
    }

    public void transfer(String toWhere, double amount){
        balance -= amount;
        System.out.println("Transferring to " + toWhere);
        printBalance();
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public String setAccountNumber(){
        String lastTwoOfSSN = ssn.substring(ssn.length()-2);
        int random = (int) (Math.random() * Math.pow(10,3));
        return lastTwoOfSSN + uniqueID + random;
    }

    public void showInfo(){
        System.out.println("Account Number: " + this.accountNumber);
        System.out.println("Name: " + name +" SSN: " + ssn + " balance = $" +balance + " Rate: " + rate + "%");
    }

}
