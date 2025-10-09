//Array Program for Alternate Number
import java.util.Scanner;

public class Array10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i, arr[] = new int[10];
        System.out.println("Enter Array Element");
        for (i = 0; i < 10; i++) {
            System.out.print("arr[" + i + "]=");
            arr[i] = input.nextInt();
        }
        System.out.println("Alternate Number");
        for (i = 0; i < 10; i+=2) {
            System.out.println(arr[i]);
        }
    }
}
