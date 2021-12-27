package application;

import services.InterestService;
import services.USAInterestService;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Amount: ");
        double amount = scanner.nextDouble();
        System.out.print("Months: ");
        int months = scanner.nextInt();

        InterestService interestService = new USAInterestService(1.0);
        double payment = interestService.payment(amount, months);

        System.out.println("Payment for " + months + " months:");
        System.out.printf("R$%.2f%n", payment);

        scanner.close();
    }
}
