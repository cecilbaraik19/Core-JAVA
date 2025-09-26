//Nested Loop : Program for Armstrong from 101 to 999
import java.util.*;
public class NestedLoop_ArmstrongNo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i,n,d=0,sum=0;
        System.out.println("Armstrong No. from 101 to 999");
        for(i=101;i<=999;i++)
        {
            n=i;
            while(n>0)
            {
                d=n%10;
                sum=sum+d*d*d;
                n=n/10;
            }
            if(sum==i)
            {
                System.out.print(i+" ");
            }
            sum=0;
        }
    }
}
