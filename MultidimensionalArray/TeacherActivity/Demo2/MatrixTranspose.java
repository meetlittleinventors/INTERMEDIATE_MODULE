public class MatrixTranspose {
    public static void main(String[] args) {
        int[][] A = { {1, 2, 3}, {4, 5, 6} };
        int[][] T = new int[3][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                T[j][i] = A[i][j];
            }
        }

        System.out.println("Transpose of Matrix:");
        for (int[] row : T) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
