//For Loop - Factorial of any No. given input by the User
import java.util.*;
public class ForLoop10_FactorialNo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, f = 1;
        System.out.println("Enter any number:");
        n = input.nextInt();

        System.out.print("Factorial expression: ");
        for (int i = n; i > 0; i--) {
            System.out.print(i);
            if (i > 1) {
                System.out.print(" x ");
            }
            f = f * i;
        }

        System.out.println(" = " + f);
    }
}
