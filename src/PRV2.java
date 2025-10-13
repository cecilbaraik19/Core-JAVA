// Parameter & Return Value Function: Program for Sum of Three Digit Number
import java.util.*;

public class PRV2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c, n;

        System.out.println("Enter any three-digit number:");
        n = input.nextInt();

        a = n % 10;     // last digit
        n = n / 10;
        b = n % 10;     // middle digit
        n = n / 10;
        c = n % 10;     // first digit

        int sum = sumDigitNo(a, b, c);

        System.out.println("Sum of three digits is: " + c + " + " + b + " + " + a + " = " + sum);
    }

    static int sumDigitNo(int w, int x, int y) {
        int z;
        z = w + x + y;
        return z;
    }
}
