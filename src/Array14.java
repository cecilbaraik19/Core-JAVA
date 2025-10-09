//Array Program: Insertion Sort
import java.util.*;
public class Array14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i, j, s, temp;
        System.out.println("Enter Array Size");
        s = input.nextInt();
        int arr[] = new int[s];
        System.out.println("Enter Array Element");
        for (i = 0; i < s; i++) {
            System.out.print("arr[" + i + "]=");
            arr[i] = input.nextInt();
        }
        System.out.println("Array Element");
        for(i=0;i<s-1;i++)
        {
            System.out.println(arr[i]);
        }
        for(i=1;i<s;i++)
        {
            temp=arr[i];
            j=i-1;
            while(j>=0 && temp<arr[j])
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
        System.out.println("Data After Sorting");
        for(i=0;i<s;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
