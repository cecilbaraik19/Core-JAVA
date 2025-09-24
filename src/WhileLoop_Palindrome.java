//While Loop Program to find Palindrome Number
import java.util.*;
public class WhileLoop_Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rev=0,num,n,d;
        System.out.println("Enter any No.");
        num = input.nextInt();
        n=num;
        while(n>0)
        {
            d=n%10;
            rev = rev*10+d;
            n=n/10;
        }
        System.out.println("Reverse No. :"+rev);
        if(num == rev)
        {
            System.out.println("Given number is a Palindrome No.");
        }
        else {
            System.out.println("Given number is NOT a Palindrome No.");
        }
    }
}
