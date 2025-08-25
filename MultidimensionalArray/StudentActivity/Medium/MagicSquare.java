public class MagicSquare {
    public static void main(String[] args) {
        int[][] matrix = {
            {2, 7, 6},
            {9, 5, 1},
            {4, 3, 8}
        };

        int n = matrix.length;
        int magicSum = 0;
        for (int j = 0; j < n; j++) {
            magicSum += matrix[0][j];
        }

        boolean isMagic = true;

        // Check rows
        for (int i = 1; i < n; i++) {
            int rowSum = 0;
            for (int j = 0; j < n; j++) rowSum += matrix[i][j];
            if (rowSum != magicSum) isMagic = false;
        }

        // Check columns
        for (int j = 0; j < n; j++) {
            int colSum = 0;
            for (int i = 0; i < n; i++) colSum += matrix[i][j];
            if (colSum != magicSum) isMagic = false;
        }

        // Check diagonals
        int d1 = 0, d2 = 0;
        for (int i = 0; i < n; i++) {
            d1 += matrix[i][i];
            d2 += matrix[i][n - 1 - i];
        }
        if (d1 != magicSum || d2 != magicSum) isMagic = false;

        System.out.println(isMagic ? "Magic Square" : "Not a Magic Square");
    }
}
