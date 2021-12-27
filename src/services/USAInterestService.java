package services;

public class USAInterestService implements InterestService {

    //Attributes
    double interestRate;

    //Constructor
    public USAInterestService(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public double getInterestRate() {
        return interestRate;
    }
}
