import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // TEMPERATURE CONVERTER //

        // Initializing the Scanner object to read user input.
        Scanner scanner = new Scanner(System.in);

        // Declaring variables for temperature, converted temperature and temperature unit.
        double temp, newTemp;
        String unit;

        // Asking the user for temperature value.
        System.out.print("Enter the temperature: ");
        temp = scanner.nextDouble();

        // Asking the user the unit of temperature to be converted.
        System.out.print("Convert to Celsius or Fahrenheit? [C or F]: ");
        unit = scanner.next();

        // Using ternary operator to check the unit to be converted and applying the respective formula.
        newTemp = (unit.equalsIgnoreCase("F") ? temp * 9/5 + 32 : (temp - 32) * 5/9);

        // Displaying the converted value to user.
        System.out.printf("The converted temperature is %.2f°%s\n", newTemp, unit.toUpperCase());

        // Closing the Scanner object to avoid resource leaks.
        scanner.close();
    }
}
