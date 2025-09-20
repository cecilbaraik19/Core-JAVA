//Program for Sum of Three Digit No.
import java.util.*;
public class Abc23_SumThreeDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b,c,d,n;
        System.out.println("Enter any Three Digit No.");
        n = input.nextInt();
        a = n%10;
        n = n/10;
        b = n%10;
        n = n/10;
        c = n%10;
        d = a+b+c;
        System.out.println("Sum of three digit no. is :"+c+"+"+b+"+"+a+"="+d);
    }
}
