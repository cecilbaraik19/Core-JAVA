// Parameter & Return Value Function: Program for Armstrong Number
import java.util.*;

public class PRV7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;

        System.out.println("Enter any number:");
        num = input.nextInt();

        boolean result = isArmstrong(num);

        if (result)
            System.out.println("This is an Armstrong Number");
        else
            System.out.println("This is NOT an Armstrong Number");
    }
    static boolean isArmstrong(int n) {
        int temp = n, d, sum = 0;

        while (n > 0) {
            d = n % 10;
            sum = sum + (d * d * d);
            n = n / 10;
        }

        // Return true if Armstrong, false otherwise
        return (sum == temp);
    }
}
