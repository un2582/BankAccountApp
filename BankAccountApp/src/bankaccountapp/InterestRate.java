package bankaccountapp;

public interface InterestRate {
    //Write method to get base rate
    default double getBaseRate(){
        return 2.5;
    }
}
