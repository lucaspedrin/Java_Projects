import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // EMAIL SPLITTER //

        // Initializing the Scanner object to read user input.
        Scanner scanner = new Scanner(System.in);

        // Declaring variables to hold the email, username, and domain.
        String email, username, domain;

        // Prompting the user to enter their email address.
        System.out.print("Enter your email: ");
        email = scanner.nextLine();

        // Checking if the email contains the "@" symbol.
        if (email.contains("@")){

            // Extracting the username and domain using the substring method.
            username = email.substring(0, email.indexOf("@")); // Extracts everything before "@" as the username.
            domain = email.substring(email.indexOf("@") + 1); // Extracts everything after "@" as the domain.

            // Displaying the extracted username and domain to the user.
            System.out.println("Your username is: " + username);
            System.out.println("Your domain is: " + domain);
        } else {
            // Informing the user that the email must contain an "@" symbol.
            System.out.println("Emails must contain @!");
        }

        // Closing the Scanner object to release resources.
        scanner.close();
    }
}
