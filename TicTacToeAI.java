
import java.util.Scanner;

public class TicTacToeAI {

    static char[][] board = {
        {' ', ' ', ' '},
        {' ', ' ', ' '},
        {' ', ' ', ' '}
    };

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int row, col;

        System.out.println("================================");
        System.out.println("      TIC TAC TOE GAME");
        System.out.println("================================");
        System.out.println("You are X");
        System.out.println("Computer is O\n");

        while (true) {

            printBoard();

            // User Move
            System.out.print("Enter row (0-2): ");
            row = sc.nextInt();

            System.out.print("Enter column (0-2): ");
            col = sc.nextInt();

            if (board[row][col] == ' ') {
                board[row][col] = 'X';
            } else {
                System.out.println("Cell already filled!");
                continue;
            }

            // Check if player wins
            if (checkWin('X')) {
                printBoard();
                System.out.println("You Win!");
                break;
            }

            // Check draw
            if (isBoardFull()) {
                printBoard();
                System.out.println("Match Draw!");
                break;
            }

            // Computer Move
            computerMove();

            // Check if computer wins
            if (checkWin('O')) {
                printBoard();
                System.out.println("Computer Wins!");
                break;
            }

            // Check draw again
            if (isBoardFull()) {
                printBoard();
                System.out.println("Match Draw!");
                break;
            }
        }
    }

    // Print Board
    static void printBoard() {

        System.out.println();

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j]);

                if (j < 2) {
                    System.out.print(" | ");
                }
            }

            System.out.println();

            if (i < 2) {
                System.out.println("--|---|--");
            }
        }

        System.out.println();
    }

    // Computer Move
    static void computerMove() {

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                if (board[i][j] == ' ') {
                    board[i][j] = 'O';
                    return;
                }
            }
        }
    }

    // Check Winner
    static boolean checkWin(char player) {

        // Rows and Columns
        for (int i = 0; i < 3; i++) {

            if (board[i][0] == player
                    && board[i][1] == player
                    && board[i][2] == player) {

                return true;
            }

            if (board[0][i] == player
                    && board[1][i] == player
                    && board[2][i] == player) {

                return true;
            }
        }

        // Diagonals
        if (board[0][0] == player
                && board[1][1] == player
                && board[2][2] == player) {

            return true;
        }

        if (board[0][2] == player
                && board[1][1] == player
                && board[2][0] == player) {

            return true;
        }

        return false;
    }

    // Check Draw
    static boolean isBoardFull() {

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }

        return true;
    }
}
