//Nested Loop: Palindrome No. from 101 to 999
import java.util.*;
public class NestedLoop_Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i,n,d=0,r=0;
        System.out.println("Palindrome No. from 101 to 999");
        for(i=101;i<=999;i++)
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
                System.out.print(i+" ");
            }
            r=0;
        }
    }
}
