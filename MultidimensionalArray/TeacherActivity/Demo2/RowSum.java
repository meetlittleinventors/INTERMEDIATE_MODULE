public class RowSum {
    public static void main(String[] args) {
        int[][] marks = {
            {78, 85, 90},
            {92, 88, 79},
            {65, 70, 68}
        };

        for (int i = 0; i < marks.length; i++) {
            int sum = 0;
            for (int j = 0; j < marks[i].length; j++) {
                sum += marks[i][j];
            }
            System.out.println("Total of Student " + (i+1) + " = " + sum);
        }
    }
}
