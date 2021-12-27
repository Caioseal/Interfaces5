package services;

public class BrazilInterestService implements InterestService {

    //Attributes
    double interestRate;

    //Constructor
    public BrazilInterestService(double interestRate) {
        this.interestRate = interestRate;
    }

    //Getter and Setter
    @Override
    public double getInterestRate() {
        return interestRate;
    }
}
