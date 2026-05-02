public class UC8 {
    static boolean isHumanTurn = true;
    static boolean gameOver = false;
    public static void main(String[] args) {

        while (!gameOver) {
            if (isHumanTurn) {
                System.out.println("Human's turn");
            } else {
                System.out.println("Computer's turn");
            }
            isHumanTurn = !isHumanTurn;
            gameOver = true;
        }
        System.out.println("Game Over!");
    }
}