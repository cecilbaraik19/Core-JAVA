//Do While Loop Program for Factorial of any No.
import java.util.*;
public class DoWhileFactorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,f=1;
        System.out.println("Enter any No.");
        n = input.nextInt();
        do {
            f=f*n;
            n--;
        }
        while(n>0);
        System.out.println("Factorial is : "+f);
    }
}
