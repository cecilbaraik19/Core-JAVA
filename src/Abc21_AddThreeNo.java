// Add three Numbers
import java.util.*;
public class Abc21_AddThreeNo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b,c,d;
        System.out.println("Enter the value of a");
        a = input.nextInt();
        System.out.println("Enter the value of b ");
        b = input.nextInt();
        System.out.println("Enter the value of c ");
        c = input.nextInt();
        System.out.println("Value of a  :"+a);
        System.out.println("Value of b  :"+b);
        System.out.println("Value of c  :"+c);
        d = a+b+c;
        System.out.println("Sum of three no. :"+d);
    }
}
