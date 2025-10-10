//Matrix:Taking input from user
import java.util.*;
public class Matrix2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i,j,arr[][] = new int[3][3];
        System.out.println("Enter Matrix Element");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.print("arr["+i+"]["+i+"]=");
                arr[i][j]=input.nextInt();
            }
        }
        System.out.println("Matrix Element");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
