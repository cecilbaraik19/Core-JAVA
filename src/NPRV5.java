//No Parameter & Return Value Function Program: Counting of Prime number from 1 to 100
import java.util.*;
public class NPRV5 {
    public static void main(String[] args) {
        int r;
        r=CountPrime();
        System.out.println("\n Prime No. from 1 to 100: "+r);
    }
    static int CountPrime()
    {
        int i,c=0,n,p=0;
        for(n=1;n<=100;n++)
        {
            for(i=1;i<=n;i++)
            {
                if(n%i==0)
                {
                    c++;
                }
            }
            if(c==2)
            {
                System.out.print(n+"  ");
                p++;
            }
            c=0;
        }
        return p;
    }
}
