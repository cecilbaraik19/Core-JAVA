//Array Program for counting the Odd and Even number
import java.util.*;
public class Array8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i, s,on=0,en=0;
        System.out.println("Enter Array Size");
        s = input.nextInt();
        int arr[] = new int[s];
        System.out.println("Enter Array Element");
        for (i = 0; i < s; i++) {
            System.out.print("arr[" + i + "]=");
            arr[i] = input.nextInt();
        }
        System.out.println("Even Number");
        for (i = 0; i < s; i++) {
            if(arr[i]%2==0)
            {
                en++;
            }
            else{
                on++;
            }
        }
        System.out.println("Total Even No.   :"+en);
        System.out.println("Total Odd No.    :"+on);
    }
}
