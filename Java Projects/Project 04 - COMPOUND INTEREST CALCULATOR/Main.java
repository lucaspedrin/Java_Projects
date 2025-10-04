import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // COMPOUND INTEREST CALCULATOR //

        // Initializing a Scanner object to read user input.
        Scanner scanner = new Scanner(System.in);

        int timesCompounded, years;
        double principal, rate, amount;

        // Prompting the user for input values.
        System.out.print("Enter the principal amount: ");
        principal = scanner.nextDouble();

        System.out.print("Enter the interest rate (in %): ");
        rate = scanner.nextDouble() / 100; // Converting percentage to decimal.

        System.out.print("Enter the number of times compounded per year: ");
        timesCompounded = scanner.nextInt();

        System.out.print("Enter the number of years: ");
        years = scanner.nextInt();

        // Applying the compound interest formula to calculate the final amount.
        amount = principal * Math.pow(1 + rate / timesCompounded, timesCompounded * years);

        // Displaying the calculated amount to the user.
        System.out.printf("The amount after %d years is $%.2f", years, amount);

        scanner.close(); // Closing the Scanner to prevent resource leaks.
    }
}
