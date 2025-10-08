//Binary Search
import java.util.*;
public class Array5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i, num, s, count = 0, first = 0, last = 0, mid = 0;
        System.out.println("Enter Array Size");
        s = input.nextInt();
        int arr[] = new int[s];
        System.out.println("Enter Array Element");
        for (i = 0; i < s; i++) {
            System.out.print("arr[" + i + "]=");
            arr[i] = input.nextInt();
        }
        System.out.println("Array Element");
        for (i = 0; i < s; i++) {
            System.out.println(arr[i]);
        }
        System.out.print("Enter the No. want to be search....");
        num = input.nextInt();
        last = s-1;
        while((first<=last)&&(count==0))
        {
            mid=(first+last)/2;
            if(arr[mid]==num)
            {
                count = mid + 1;
            }
            else if(arr[mid]<num)
            {
                first = mid+1;
            }
            else {
            last = mid - 1;
        }
        }
        if(count > 0)
        {
            System.out.println("Given No. found at "+count+ " Position");
        }
        else {
            System.out.println("Given no. NOT found");
        }
    }
}
