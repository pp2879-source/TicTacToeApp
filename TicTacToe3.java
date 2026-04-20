import java.util.Scanner;

public class TicTacToe3 {

    static Scanner scanner = new Scanner(System.in);

    // Method to get user input
    public static int getUserSlot() {
        int slot;

        while (true) {
            System.out.print("Enter a slot (1-9): ");

            // Check if input is integer
            if (scanner.hasNextInt()) {
                slot = scanner.nextInt();

                // Validate range
                if (slot >= 1 && slot <= 9) {
                    return slot;  // valid input
                } else {
                    System.out.println("Invalid! Enter number between 1 and 9.");
                }
            } else {
                System.out.println("Invalid input! Enter a number.");
                scanner.next(); // clear wrong input
            }
        }
    }

    // Convert slot to row & column
    public static int[] getPosition(int slot) {
        int row = (slot - 1) / 3;
        int col = (slot - 1) % 3;
        return new int[]{row, col};
    }

    public static void main(String[] args) {

        int slot = getUserSlot();
        int[] pos = getPosition(slot);

        System.out.println("You selected slot: " + slot);
        System.out.println("Row: " + pos[0] + ", Column: " + pos[1]);
    }
}