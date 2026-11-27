public class Main5 {
    public static void main(String[] args) {

        int[][] matrix = {
                {5, 12, 3, 8},
                {20, 7, 15, 2},
                {9, 18, 4, 11}
        };

        int min = matrix[0][0];
        int max = matrix[0][0];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {

                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }

                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }

        System.out.println("Minimum = " + min);
        System.out.println("Maximum = " + max);
    }
}