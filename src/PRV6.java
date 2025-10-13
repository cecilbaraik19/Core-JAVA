// Parameter & Return Value Function: Program for Palindrome Number
import java.util.*;

public class PRV6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;

        System.out.println("Enter any number:");
        num = input.nextInt();

        boolean result = isPalindrome(num);

        if (result)
            System.out.println("This is a Palindrome Number");
        else
            System.out.println("This is NOT a Palindrome Number");
    }

    static boolean isPalindrome(int n) {
        int rev = 0, d, temp = n;

        while (n > 0) {
            d = n % 10;
            rev = rev * 10 + d;
            n = n / 10;
        }

        // Return true if palindrome, false otherwise
        return (rev == temp);
    }
}
