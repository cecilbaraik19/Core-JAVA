// Parameter & Return Value Function: Program for Prime Number
import java.util.*;

public class PRV8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;

        System.out.println("Enter any number:");
        num = input.nextInt();

        boolean result = isPrime(num);

        if (result)
            System.out.println("This is a Prime Number");
        else
            System.out.println("This is NOT a Prime Number");
    }

    static boolean isPrime(int n) {
        if (n <= 1)
            return false;

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0)
                return false;
        }

        return true;
    }
}
