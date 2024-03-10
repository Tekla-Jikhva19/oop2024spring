   import java.util.Scanner;

    public class MinutesToSeconds {
        public static void main(String[] args) {
            // Create a Scanner object to read input from the user
            Scanner scanner = new Scanner(System.in);

            // Get input from the user
            System.out.print("Enter the number of minutes: ");
            int minutes = scanner.nextInt();

            int seconds = minutes * 60;

            System.out.println(minutes + " minutes is equal to " + seconds + " seconds.");

            scanner.close();
        }
    }


