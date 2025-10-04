import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // BASIC GEOMETRIC CALCULATOR //

        // Initializing the scanner to read user input
        Scanner scanner = new Scanner(System.in);

        double radius, circumference, area, volume;

        // Asking for the radius value
        System.out.print("Enter the value of the radius: ");
        radius = scanner.nextDouble();

        // Calculating the circumference, area and volume based on radius value
        circumference = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius, 2);
        volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

        // Displaying the result to the user
        System.out.printf("The circumference is: %.1fcm\n", circumference);
        System.out.printf("The area is: %.1fcm²\n", area);
        System.out.printf("The volume is: %.1fcm³\n", volume);
    }
}
