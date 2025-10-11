// Transpose of Matrix
import java.util.*;
public class Matrix5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arr1[][] = new int[3][3];
        int arr2[][] = new int[3][3];
        int i, j;

        System.out.println("Enter Matrix Elements:");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print("arr[" + i + "][" + j + "] = ");
                arr1[i][j] = input.nextInt();
            }
        }

        System.out.println("\nMatrix Elements:");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }

        // ✅ Transpose logic
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                arr2[i][j] = arr1[j][i];
            }
        }

        System.out.println("\nTranspose of Matrix:");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
