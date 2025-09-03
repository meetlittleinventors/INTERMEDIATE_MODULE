public class ColumnAverage {
    public static void main(String[] args) {
        int[][] marks = {
            {78, 85, 90},
            {92, 88, 79},
            {65, 70, 68}
        };

        int subjects = marks[0].length;

        for (int j = 0; j < subjects; j++) {
            int sum = 0;
            for (int i = 0; i < marks.length; i++) {
                sum += marks[i][j];
            }
            double avg = (double) sum / marks.length;
            System.out.println("Average of Subject " + (j+1) + " = " + avg);
        }
    }
}
