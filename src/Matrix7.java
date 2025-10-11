// Matrix Program for Sum of Below Triangle and Right Diagonal
import java.util.*;
public class Matrix7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arr[][] = new int[3][3];
        int i, j, bt = 0, rd = 0;

        System.out.println("Enter Matrix Elements:");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print("arr[" + i + "][" + j + "] = ");
                arr[i][j] = input.nextInt();
            }
        }

        System.out.println("\nMatrix Elements:");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");

                // Below (lower) triangle → elements where row > column
                if (i > j) {
                    bt = bt + arr[i][j];
                }

                // Right diagonal (secondary diagonal)
                if (i + j == 2) {  // For 3×3 matrix, n-1 = 2
                    rd = rd + arr[i][j];
                }
            }
            System.out.println();
        }

        System.out.println("\nSum of Below Triangle: " + bt);
        System.out.println("Sum of Right Diagonal: " + rd);
    }
}
