//Sum of Matrix Column
import java.util.*;
public class Matrix8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arr[][] = new int[3][3];
        int i,j,sc=0;
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
        for(i=0;i<3;i++) {
            for (j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                sc=sc+arr[j][i];
            }
            System.out.print(sc+" ");
            sc=0;
        }
    }
}
