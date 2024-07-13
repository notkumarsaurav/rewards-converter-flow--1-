import java.util.Scanner;

public class RewardsConverter {
    private double cashValue;

    public RewardsConverter(double cashValue) {
        this.cashValue = cashValue;
    }

    public double getCashValue() {
        return cashValue;
    }

    public double getMilesValue() {
        // Example conversion logic: 1 dollar = 0.1 miles
        return cashValue * 0.1;
    }

    public double milesToCashConversion(double milesValue) {
        // Example conversion logic: 1 mile = 0.0035 dollars
        return milesValue * 0.0035;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Credit Card Rewards Converter!");

        // Get cash value input from user
        System.out.println("Please enter a cash value to convert to airline miles: ");
        String input_value = scanner.nextLine();
        double cashValue;
        try {
            cashValue = Double.parseDouble(input_value);
        } catch (NumberFormatException exception) {
            System.out.println("Could not parse input value as a double, exiting");
            scanner.close();
            return;
        }

        // Create an instance of RewardsConverter with the cashValue
        RewardsConverter converter = new RewardsConverter(cashValue);

        // Perform conversions and display results
        System.out.println("Converting $" + input_value + " to miles");
        System.out.println("$" + input_value + " is worth " + converter.getMilesValue() + " miles");

        // Perform miles to cash conversion and display results
        double milesValue = converter.getMilesValue();
        double convertedCashValue = converter.milesToCashConversion(milesValue);
        System.out.println(milesValue + " miles is worth $" + convertedCashValue);

        scanner.close();
    }
}