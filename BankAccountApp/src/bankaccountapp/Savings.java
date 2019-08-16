package bankaccountapp;

public class Savings extends Account {
    //List properties unique to savings
    int safetyDepositBoxID;
    int safetyDepositBoxKey;

    //constructor with super
    public Savings(String name, String ssn, double balance){
        super(name, ssn, balance);
        setSafetyDepositBox();
        //showInfo();
    }

    //List methods unique to Savings
    @Override
    public void setBaseRate() {
        setRate(getBaseRate() - .25);
    }

    public void setSafetyDepositBox(){
        safetyDepositBoxID =  (int)(Math.random() * Math.pow(10,3));
        safetyDepositBoxKey = (int)(Math.random() * Math.pow(10,4));
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println(
                "Your Savings Account info: " +
                "\nSafety deposit box id: " + safetyDepositBoxID +
                "\nSafety deposit box key: " + safetyDepositBoxKey
        );

    }

    @Override
    public String setAccountNumber() {
        return "1" + super.setAccountNumber();
    }
}
