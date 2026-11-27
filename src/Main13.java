public class Main13 {
    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };

        int maxSum = Integer.MIN_VALUE;
        int maxRow = 0;

        for (int i = 0; i < 3; i++) {

            int sum = 0;

            for (int j = 0; j < 4; j++) {
                sum += matrix[i][j];
            }

            if (sum > maxSum) {
                maxSum = sum;
                maxRow = i;
            }
        }

        System.out.println("Row = " + (maxRow + 1));
        System.out.println("Largest sum = " + maxSum);
    }
}