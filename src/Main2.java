public class Main2 {
    public static void main(String[] args) {

        int[][] matrix = {
                {5, 10, 15},
                {20, 25, 30}
        };

        System.out.println(matrix[1][2]);

        matrix[0][1] = 99;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}