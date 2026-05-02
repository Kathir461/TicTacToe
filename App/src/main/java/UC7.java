import java.util.Random;

public class UC7{
    static char[][] board = {
            {'-', '-', '-'},
            {'-', '-', '-'},
            {'-', '-', '-'}
    };
    static char computerSymbol = 'O';
    public static void main(String[] args) {
        computerMove();
        printBoard();
    }
    static int getRowFromSlot(int slot) {
        return (slot - 1) / 3;
    }
    static int getColFromSlot(int slot) {
        return (slot - 1) % 3;
    }
    static void computerMove() {
        Random rand = new Random();
        int slot, row, col;
        while (true) {
            slot = rand.nextInt(9) + 1; // 1–9
            row = getRowFromSlot(slot);
            col = getColFromSlot(slot);
            if (board[row][col] == '-') {
                board[row][col] = computerSymbol;
                System.out.println("Computer chose slot: " + slot);
                break;
            }
        }
    }
    static void printBoard() {
        System.out.println("\nBoard:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}