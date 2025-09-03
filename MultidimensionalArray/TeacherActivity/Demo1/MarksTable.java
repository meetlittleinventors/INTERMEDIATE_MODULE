public class MarksTable {
    public static void main(String[] args) {
        int[][] marks = {
            {78, 85, 90},
            {92, 88, 79},
            {65, 70, 68}
        };

        System.out.println("Student Marks Table:");
        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks[i].length; j++) {
                System.out.print(marks[i][j] + " ");
            }
            System.out.println();
        }
    }
}
