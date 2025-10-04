import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // WEIGHT CONVERTER //

        // Initializing the Scanner object to read user input.
        Scanner scanner = new Scanner(System.in);

        // Variables to store user choice and weight values for conversion.
        int option;
        double kg, lbs;

        // Displaying program options and prompting user for input.
        System.out.println("<< Weight Converter Program >>");
        System.out.println("[1]: Convert kgs to lbs");
        System.out.println("[2]: Convert lbs to kg");
        System.out.print("Choose an option: ");
        option = scanner.nextInt();

        // Checking user's choice.
        if (option == 1) { // Option 1: KGS > LBS

            // Asking user to enter the weight value in kgs.
            System.out.print("Enter the weight in kgs: ");
            kg = scanner.nextDouble();

            // Using formula to convert kgs to lbs.
            lbs = kg * 2.205;

            // Displaying the final result.
            System.out.printf("The new weight in lbs is: %.2f\n", lbs);

        } else if (option == 2) { // Option 2: LBS > KGS

            // Asking user to enter the weight value in lbs.
            System.out.print("Enter the weight in lbs: ");
            lbs = scanner.nextDouble();

            // Using formula to convert lbs to kgs.
            kg = lbs / 2.205;

            // Displaying the final result.
            System.out.printf("The new weight in kgs is: %.2f\n", kg);

        } else { // Neither options.
            System.out.println("ERROR! Invalid option!"); // Displaying error message for invalid option.
        }

        // Closing the Scanner object to prevent resource leaks.
        scanner.close();
    }
}
