import java.util.Scanner;

public class AirplaneTicketing {
    private static final int ROWS = 20;
    private static final int COLUMNS = 8;
    private static final String[][] seats = new String[ROWS][COLUMNS];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        initializeSeats();

        while (true) {
            System.out.println("\nAirplane Ticket Booking System");
            System.out.println("1. View Seats");
            System.out.println("2. Book a Seat");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            System.out.println("---------------------------");
            System.out.println("Developed by masterplan jr.");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    displaySeats();
                    break;
                case 2:
                    bookSeat(scanner);
                    break;
                case 3:
                    System.out.println("Exiting the system. Have a nice flight!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void initializeSeats() {
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                seats[i][j] = "Available";
            }
        }
    }

    private static void displaySeats() {
        System.out.println("\nSeating Chart:");
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                System.out.print((seats[i][j].equals("Available") ? "[ ]" : "[X]") + " ");
            }
            System.out.println();
        }
    }

    private static void bookSeat(Scanner scanner) {
        System.out.print("Enter row number (1-20): ");
        int row = scanner.nextInt() - 1;
        System.out.print("Enter column number (1-8): ");
        int col = scanner.nextInt() - 1;

        if (row < 0 || row >= ROWS || col < 0 || col >= COLUMNS) {
            System.out.println("Invalid seat selection. Please choose a valid seat.");
            return;
        }

        if (seats[row][col].equals("Available")) {
            System.out.print("Enter passenger name: ");
            String passengerName = scanner.next();
            seats[row][col] = passengerName;
            System.out.println("Seat successfully booked for " + passengerName);
        } else {
            System.out.println("Seat already taken! Choose another seat.");
        }
    }
}

