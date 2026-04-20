import java.util.Random;
public class UC2 {
    // Game State Variables
    private static String player1 = "Player 1";
    private static String player2 = "Player 2";
    private static String currentPlayer;
    private static String p1Symbol;
    private static String p2Symbol;

    public static void main(String[] args) {
        performToss();
    }

    public static void performToss() {
        Random random = new Random();
        System.out.println("--- Initiating Toss ---");

        // 1. Random Number Generation (0 or 1)
        int tossResult = random.nextInt(2);

        // 2. Conditional Logic & Symbol Assignment
        if (tossResult == 0) {
            // Player 1 wins the toss
            currentPlayer = player1;
            p1Symbol = "X";
            p2Symbol = "O";
            System.out.println(player1 + " won the toss!");
        } else {
            // Player 2 wins the toss
            currentPlayer = player2;
            p2Symbol = "X";
            p1Symbol = "O";
            System.out.println(player2 + " won the toss!");
        }

        // 3. Store and Display Current Player Information
        System.out.println(player1 + " is assigned: " + p1Symbol);
        System.out.println(player2 + " is assigned: " + p2Symbol);
        System.out.println("First Turn: " + currentPlayer + " (" + (currentPlayer.equals(player1) ? p1Symbol : p2Symbol) + ")");
        System.out.println("-----------------------");
    }
}