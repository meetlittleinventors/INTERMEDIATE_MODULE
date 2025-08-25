public class SudokuValidator {
    public static void main(String[] args) {
        int[][] board = {
            {5, 3, 0, 0, 7, 0, 0, 0, 0},
            {6, 0, 0, 1, 9, 5, 0, 0, 0},
            {0, 9, 8, 0, 0, 0, 0, 6, 0},
            {8, 0, 0, 0, 6, 0, 0, 0, 3},
            {4, 0, 0, 8, 0, 3, 0, 0, 1},
            {7, 0, 0, 0, 2, 0, 0, 0, 6},
            {0, 6, 0, 0, 0, 0, 2, 8, 0},
            {0, 0, 0, 4, 1, 9, 0, 0, 5},
            {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };

        System.out.println(isValidSudoku(board) ? "Valid Sudoku" : "Invalid Sudoku");
    }

    static boolean isValidSudoku(int[][] board) {
        for (int i = 0; i < 9; i++) {
            boolean[] rowCheck = new boolean[10];
            boolean[] colCheck = new boolean[10];
            for (int j = 0; j < 9; j++) {
                // Row check
                if (board[i][j] != 0) {
                    if (rowCheck[board[i][j]]) return false;
                    rowCheck[board[i][j]] = true;
                }
                // Column check
                if (board[j][i] != 0) {
                    if (colCheck[board[j][i]]) return false;
                    colCheck[board[j][i]] = true;
                }
            }
        }

        // Sub-grid check
        for (int row = 0; row < 9; row += 3) {
            for (int col = 0; col < 9; col += 3) {
                boolean[] boxCheck = new boolean[10];
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        int num = board[row + i][col + j];
                        if (num != 0) {
                            if (boxCheck[num]) return false;
                            boxCheck[num] = true;
                        }
                    }
                }
            }
        }

        return true;
    }
}
