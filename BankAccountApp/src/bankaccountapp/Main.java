package bankaccountapp;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Account> accounts = new LinkedList<Account>();
	// read a csv file and make accounts based on the data
        List<String[]> newAccountHolder =  utilities.CSV.read("C:\\Users\\un258\\Documents\\NewBankAccounts.csv");
        for(String[] accountDetails : newAccountHolder){
            String name = accountDetails[0];
            String ssn = accountDetails[1];
            String accountType = accountDetails[2];
            double initDeposit = Double.parseDouble(accountDetails[3]);
            if(accountType.equals("Savings")){
                System.out.println("Open savings account");
                accounts.add(new Savings(name, ssn, initDeposit));
            }else if(accountType.equals("Checking")){
                System.out.println("Open checking account");
                accounts.add(new Checking(name, ssn, initDeposit));
            }else{
                System.out.println("Error occurred");
            }
        }
        for(Account acc : accounts){
            System.out.println("\n********");
            acc.showInfo();
        }




    }
}
