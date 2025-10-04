import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // BASIC CALCULATOR //

        // Initializing the Scanner object to read user input.
        Scanner scanner = new Scanner(System.in);

        // Declaring variables to store the numbers, the operator and the result.
        double num1, num2, result = 0;
        String operator = "";

        // Asking user for a number.
        System.out.print("Enter a number: ");
        num1 = scanner.nextDouble();

        // Asking user for an operator.
        System.out.print("Enter an operator [+, -, *, /, %]: ");
        operator = scanner.next();

        // Asking user for another number.
        System.out.print("Enter another number: ");
        num2 = scanner.nextDouble();

        // Analyzing the operator case and performing the respective calculation.
        switch (operator) {
            case "+" -> result = num1 + num2; // Sum.
            case "-" -> result = num1 - num2; // Subtraction.
            case "*" -> result = num1 * num2; // Multiplication.
            case "/" -> result = num1 / num2; // Division.
            case "%" -> result = num1 % num2; // Rest of division.
            default -> System.out.println("ERROR! Invalid operator!"); // In case of invalid operator.
        }

        // Displaying the expression and result to the user.
        System.out.printf("%.2f %s %.2f = %.2f", num1, operator, num2, result);

        // Closing the Scanner object to avoid resource leaks.
        scanner.close();
    }
}
