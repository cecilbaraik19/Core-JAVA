//While Loop program to find SPY No.
import java.util.*;
public class WhileLoop_SpyNo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,s=0,p=1,d;
        System.out.println("Enter any No.");
        n = input.nextInt();
        while(n>0)
        {
            d = n%10;
            s=s+d;
            p=p*d;
            n=n/10;
        }
        if(s==p)
        {
            System.out.println("Given number is a SPY No.");
        }
        else{
            System.out.println("Given number is NOT a spy no.");
        }
    }
}
