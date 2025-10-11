//Sum of Two Matrix
import java.util.*;
public class Matrix6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arr1[][] = new int[3][3];
        int arr2[][] = new int[3][3];
        int arr3[][] = new int[3][3];
        int i, j;

        System.out.println("Enter 1st Matrix:");
        for(i=0; i<3; i++) {
            for(j=0; j<3; j++) {
                arr1[i][j] = input.nextInt();
            }
        }

        System.out.println("Enter 2nd Matrix:");
        for(i=0; i<3; i++) {
            for(j=0; j<3; j++) {
                arr2[i][j] = input.nextInt();
            }
        }

        System.out.println("1st Matrix:");
        for(i=0; i<3; i++) {
            for(j=0; j<3; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("2nd Matrix:");
        for(i=0; i<3; i++) {
            for(j=0; j<3; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Sum of two Matrices:");
        for(i=0; i<3; i++) {
            for(j=0; j<3; j++) {
                arr3[i][j]=arr1[i][j]+arr2[i][j];
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
        }
    }
}
