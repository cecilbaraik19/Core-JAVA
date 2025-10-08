//Dynamic Array Input : Find the Maximum number and Minimum number
import java.util.*;
public class Array3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i,max,min,s;
        System.out.println("Enter Array Size");
        s=input.nextInt();
        int arr[]=new int[s];
        System.out.println("Enter Array Element");
        for(i=0;i<s;i++)
        {
            System.out.print("arr["+i+"]=");
            arr[i]=input.nextInt();
        }
        max = arr[0];
        min = arr[0];
        System.out.println("Array Element");
        for(i=0;i<s;i++)
        {
            System.out.println(arr[i]);
            if(arr[i]>max)
            {
                max = arr[i];
            }
            if(arr[i]<min)
            {
                min = arr[i];
            }
        }
        System.out.println("Max Element    :"+max);
        System.out.println("Min Element    :"+min);
    }
}
