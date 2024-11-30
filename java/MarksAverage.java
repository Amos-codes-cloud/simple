import java.util.Scanner;

public class MarksAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to input three marks
        System.out.println("Enter the first mark:");
        int mark1 = scanner.nextInt();

        System.out.println("Enter the second mark:");
        int mark2 = scanner.nextInt();

        System.out.println("Enter the third mark:");
        int mark3 = scanner.nextInt();

        // Calculate the average and round it off
        double average = (mark1 + mark2 + mark3) / 3.0;
        int roundedAverage = (int) Math.round(average);

        // Print "PASS" or "FAIL" based on the average
        if (roundedAverage >= 40) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }

        // Close the scanner
        scanner.close();
    }
}
