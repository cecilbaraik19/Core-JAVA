//Matrix: Sum of Row and Sum of Left Diagonal
import java.util.*;
public class Matrix3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arr[][] = new int[3][3];
        int i,j,sr=0,at=0,ld=0;
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
                sr=sr+arr[i][j];
                if(j>i)
                {
                    at=at+arr[i][j];
                }
                if(i==j) {
                    ld = ld + arr[i][j];
                }
            }
            System.out.println(sr);
            sr=0;
        }
        System.out.println("Sum of Above Triangle:"+at);
        System.out.println("Sum of Left Diagonal:"+ld);
    }
}
