import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // MAD LIBS GAME //

        //Initializing the scanner to read user's input
        Scanner scanner = new Scanner(System.in);

        //Initializing variables
        String adjective1;
        String noun1;
        String adjective2;
        String verb1;
        String adjective3;

        //Asking and assigning the user's inputs into variables
        System.out.print("Type an adjective: ");
        adjective1 = scanner.nextLine();
        System.out.print("Type a noun (animal/person): ");
        noun1 = scanner.nextLine();
        System.out.print("Type another adjective: ");
        adjective2 = scanner.nextLine();
        System.out.print("Type a verb (present tense): ");
        verb1 = scanner.nextLine();
        System.out.print("Type one more adjective: ");
        adjective3 = scanner.nextLine();

        //Structuring the Mad Lib story and displaying the result to the user
        System.out.println("\nYesterday I was walking kinda " + adjective1 + " to school.");
        System.out.println("I saw a " + noun1 + " running down the street.");
        System.out.println("Was I " + adjective2 + "? I don't know...");
        System.out.println("Every time I " + verb1 + ", I remember this day.");
        System.out.println("Is this " + adjective3 + "?");

        scanner.close(); //Closing the scanner to avoid memory leaks
    }
}
