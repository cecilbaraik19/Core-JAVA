//Array program for Displaying ODD number
import java.util.*;
public class Array6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i, s;
        System.out.println("Enter Array Size");
        s = input.nextInt();
        int arr[] = new int[s];
        System.out.println("Enter Array Element");
        for (i = 0; i < s; i++) {
            System.out.print("arr[" + i + "]=");
            arr[i] = input.nextInt();
        }
        System.out.println("Odd Number");
        for (i = 0; i < s; i++) {
            if(arr[i]%2==1)
            {
                System.out.println(arr[i]);
            }
        }
    }
}
