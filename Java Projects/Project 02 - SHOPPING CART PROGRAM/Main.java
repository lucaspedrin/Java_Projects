import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // SHOPPING CART PROGRAM //

        // Initializing the scanner to read user input.
        Scanner scanner = new Scanner(System.in);

        // Initializing variables for calculations and user input.
        String item;
        int quantity;
        char currency = '$';
        double price;
        double result;

        // Asking for the item name.
        System.out.print("What item would you like to buy? ");
        item = scanner.nextLine();

        // Asking about the quantity.
        System.out.print("How many " + item + "(s) would you like to buy? ");
        quantity = scanner.nextInt();

        // Asking about the price.
        System.out.print("What's the price of each " + item + "? ");
        price = scanner.nextDouble();

        result = quantity * price; // Calculating the total cost (quantity * price).

        // Displaying the total cost and details to the user.
        System.out.println("\nYou bought " + quantity + " " + item + (quantity > 1 ? "s" : "") + " for " + currency + price + " each. ");
        System.out.println("Total cost: " + currency + result);

        scanner.close(); // Closing the scanner to avoid memory leaks.
    }
}
