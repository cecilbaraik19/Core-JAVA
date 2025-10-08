//Taking input from user
import java.util.*;
public class Array2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i,arr[]=new int[10];
        System.out.println("Enter Array Element");
        for(i=0;i<10;i++)
        {
            System.out.print("arr["+i+"]=");
            arr[i]=input.nextInt();
        }
        System.out.println("Array Element");
        for(i=0;i<10;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
