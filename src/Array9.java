//Array program for Reverse number
import java.util.*;
public class Array9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i, arr[] = new int[10];
        System.out.println("Enter Array Element");
        for (i = 0; i < 10; i++) {
            System.out.print("arr[" + i + "]=");
            arr[i] = input.nextInt();
        }
        System.out.println("Reverse Number");
        for (i = 9; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}
