public class ImageInvert {
    public static void main(String[] args) {
        int[][] image = {
            {0, 50, 100},
            {150, 200, 255}
        };

        int[][] inverted = new int[2][3];

        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[0].length; j++) {
                inverted[i][j] = 255 - image[i][j];
            }
        }

        System.out.println("Inverted Image:");
        for (int[] row : inverted) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
