import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] matrix = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter threshold: ");
        int threshold = sc.nextInt();

        int count = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                if (matrix[i][j] > threshold) {
                    count++;
                }
            }
        }

        System.out.println("Count = " + count);
    }
}