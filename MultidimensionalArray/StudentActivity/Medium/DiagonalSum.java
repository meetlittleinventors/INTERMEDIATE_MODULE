public class DiagonalSum {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int mainDiag = 0, secDiag = 0;
        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            mainDiag += matrix[i][i];
            secDiag += matrix[i][n - i - 1];
        }

        System.out.println("Main diagonal sum = " + mainDiag);
        System.out.println("Secondary diagonal sum = " + secDiag);
    }
}
