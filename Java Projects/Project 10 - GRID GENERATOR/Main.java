import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // GRID GENERATOR //

        // Initializing the Scanner object to read user input.
        Scanner scanner = new Scanner(System.in);

        // Declaring variables.
        String symbol;
        int rows, columns;

        // Asking user for a symbol to display.
        System.out.print("Enter the symbol: ");
        symbol = scanner.next();

        // Asking user for the number of rows.
        System.out.print("Enter the number of rows: ");
        rows = scanner.nextInt();

        // Asking user for the number of columns.
        System.out.print("Enter the number of columns: ");
        columns = scanner.nextInt();

        // Using nested loops: the outer loop controls columns, and the inner loop displays the symbol in rows.
        for (int i = 1; i <= columns; i++) {
            for (int j = 1; j <= rows; j++) {
                System.out.print(symbol);
            }
            System.out.print("\n"); // Creating a new line for the next column.
        }

        // Closing the Scanner object to prevent a resource leak.
        scanner.close();
    }
}
