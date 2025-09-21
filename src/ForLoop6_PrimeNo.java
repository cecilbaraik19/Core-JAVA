//For Loop - Program for identify Prime No.
import java.util.*;
public class ForLoop6_PrimeNo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,c=0,i;
        System.out.println("Enter any No.");
        n = input.nextInt();
        for(i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                c++;
            }
        }
        if(c==2)
        {
            System.out.println("This is a Prime No.");
        }
        else {
            System.out.println("This is NOT a Prime No.");
        }
    }
}
