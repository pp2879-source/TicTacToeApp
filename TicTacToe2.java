import java.util.Random;

public class TicTacToe2 {

    static char playerSymbol;
    static char computerSymbol;
    static char currentPlayer;

    public static void main(String[] args) {

        Random random = new Random();

        // Toss
        int toss = random.nextInt(2); // 0 or 1

        if (toss == 0) {
            playerSymbol = 'X';
            computerSymbol = 'O';
            currentPlayer = 'P'; // Player starts

            System.out.println("Toss Result: You start first!");
        } else {
            playerSymbol = 'O';
            computerSymbol = 'X';
            currentPlayer = 'C'; // Computer starts

            System.out.println("Toss Result: Computer starts first!");
        }

        // Display assigned symbols
        System.out.println("Player Symbol: " + playerSymbol);
        System.out.println("Computer Symbol: " + computerSymbol);
    }
}