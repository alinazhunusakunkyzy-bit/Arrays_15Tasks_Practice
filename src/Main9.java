import java.util.Scanner;

public class Main9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] matrix = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter value: ");
        int value = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                if (matrix[i][j] == value && !found) {
                    System.out.println("Row: " + i);
                    System.out.println("Column: " + j);
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("Not found");
        }
    }
}
