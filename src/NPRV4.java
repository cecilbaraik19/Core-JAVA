//No Parameter & Return Value Function Program: Counting of Palindrome Number
import java.util.*;
public class NPRV4 {
    public static void main(String[] args) {
        int p;
        p=CountPal();
        System.out.println("\nPalindrome no. between 101 to 200:"+p);
    }
    static int CountPal()
    {
        int i,n,d=0,r=0,p=0;
        for(i=101;i<=200;i++)
        {
            n=i;
            while(n>0)
            {
                d=n%10;
                r=r*10+d;
                n=n/10;
            }
            if(r==i)
            {
                System.out.print(i+"  ");
                p++;
            }
            r=0;
        }
        return p;
    }
}
