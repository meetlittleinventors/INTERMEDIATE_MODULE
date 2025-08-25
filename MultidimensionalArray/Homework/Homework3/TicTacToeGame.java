import java.util.Scanner;

public class TicTacToeGame {
    public static void main(String[] args) {
        char[][] board = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
        };
        Scanner sc = new Scanner(System.in);
        char currentPlayer = 'X';

        for (int moves = 0; moves < 9; moves++) {
            // Print board
            System.out.println("\nCurrent Board:");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(board[i][j] + " ");
                }
                System.out.println();
            }

            // Input move
            System.out.print("Player " + currentPlayer + " enter row and col (0-2): ");
            int r = sc.nextInt();
            int c = sc.nextInt();

            if (board[r][c] == ' ') {
                board[r][c] = currentPlayer;
            } else {
                System.out.println("Cell already occupied! Try again.");
                moves--; // retry same move
                continue;
            }

            // Check winner
            if (checkWin(board, currentPlayer)) {
                System.out.println("Player " + currentPlayer + " wins!");
                return;
            }

            // Switch player
            currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
        }

        System.out.println("It's a Draw!");
    }

    static boolean checkWin(char[][] b, char p) {
        for (int i = 0; i < 3; i++) {
            if (b[i][0] == p && b[i][1] == p && b[i][2] == p) return true; // row
            if (b[0][i] == p && b[1][i] == p && b[2][i] == p) return true; // col
        }
        if (b[0][0] == p && b[1][1] == p && b[2][2] == p) return true; // main diag
        if (b[0][2] == p && b[1][1] == p && b[2][0] == p) return true; // sec diag
        return false;
    }
}
