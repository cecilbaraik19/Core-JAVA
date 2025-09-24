//while loop program for Factorial of any number given by the user
import java.util.*;
public class WhileLoop_FactorialNo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, f=1;
        System.out.println("Enter any No.");
        n = input.nextInt();
        while(n>0)
        {
            System.out.print(n+ "x");
            f=f*n;
            n--;
        }
        System.out.println("\b="+f);
    }
}
