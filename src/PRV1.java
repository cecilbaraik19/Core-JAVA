//Parameter & Return Value Function: Program for Product of two number
import java.util.*;
public class PRV1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b;
        System.out.println("Enter the value of a & b");
        a = input.nextInt();
        b = input.nextInt();
        System.out.println("Value of a:"+a);
        System.out.println("Value of b:"+b);
        int r = product(a,b);
        System.out.println("Product of two no. is:"+r);
    }static int product(int x,int y)
    {
        int z;
        z=x*y;
        return z;
    }
}
