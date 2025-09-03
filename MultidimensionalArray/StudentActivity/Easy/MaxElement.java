public class MaxElement {
    public static void main(String[] args) {
        int[][] arr = {
            {10, 25, 30},
            {5, 60, 15},
            {22, 18, 40}
        };

        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println("Maximum element = " + max);
    }
}
