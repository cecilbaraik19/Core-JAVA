//Program for finding out Positive and Negative No
import java.util.*;
public class Abc36_PosNegNo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Enter any No.");
        n = input.nextInt();
        if(n>0)
        {
            System.out.println("No. is Positive");
        }
        else if(n<0)
        {
            System.out.println("No. is Negative");
        }
        else
        {
            System.out.println("No. is Zero");
        }
    }
}
