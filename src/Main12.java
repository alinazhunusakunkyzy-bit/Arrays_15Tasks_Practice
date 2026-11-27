import java.util.Scanner;

public class Main12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] grades = new int[3][4];

        int total = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                grades[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {

            int sum = 0;

            for (int j = 0; j < 4; j++) {

                sum += grades[i][j];
                total += grades[i][j];

                if (grades[i][j] > max) {
                    max = grades[i][j];
                }
            }

            System.out.println("Student " + (i + 1) +
                    " average = " + (sum / 4.0));
        }

        System.out.println("Class maximum = " + max);
        System.out.println("Overall average = " + (total / 12.0));
    }
}