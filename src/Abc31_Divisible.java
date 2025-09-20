// program for checking the no. Divisible by 5 and 7
import java.util.*;
public class Abc31_Divisible {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Enter any No.");
        n = input.nextInt();
        System.out.println((n%5==0 && n%7==0) ? "No. is divisible by 5 and 7":
                (n%5==0)?"No. is only divisible by 5":
                        (n%7==0)?"No. is only divisible by 7":
                            "No. is NOT divisible by 5 and 7");
    }
}
