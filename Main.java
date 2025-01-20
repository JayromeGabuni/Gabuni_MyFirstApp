import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner
        Scanner scanner = new Scanner(System.in);

        // For da ano, yung full name scanner thingy
        System.out.print("Please enter your full name: ");
        String name = scanner.nextLine();

        // Print out the name
        System.out.println("My name is " + name + ".");

        // Current date tas timeee
        LocalDateTime currentDateTime = LocalDateTime.now();

        // Format for the time and date
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = currentDateTime.format(formatter);

        // Display for da the current date and time
        System.out.println("The current date and time is: " + formattedDateTime);

        // Close the scanner
        scanner.close();
    }
}
