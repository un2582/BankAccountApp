package bankaccountapp;

public class Checking extends Account {
    //List properties specific to checking account
    private int debitCardNumber;
    private int debitCardPin;

    //Call constructor
    public Checking(String name, String ssn, double balance){
        super(name, ssn, balance);
        setDebitCard();
        //showInfo();
    }
    private void setDebitCard(){
        debitCardNumber = (int) (Math.random() * Math.pow(10,12));
        debitCardPin = (int) (Math.random() * Math.pow(10,4));
    }

    //List methods specific to checking account
    @Override
    public void setBaseRate() {
        setRate(getBaseRate() * .15);
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Checking account info: " +
                "\nDebit card number: " + debitCardNumber +
                "\nDebit card pin: " + debitCardPin);
    }

    @Override
    public String setAccountNumber() {
        return "2" + super.setAccountNumber();
    }
}
