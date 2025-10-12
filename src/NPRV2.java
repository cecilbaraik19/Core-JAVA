//No Parameter & Return Value Function Program: Sum of ODD Number from 1 to 30
import java.util.*;
public class NPRV2 {
    public static void main(String[] args) {
        int sum;
        sum=sum_of_odd_no();
        System.out.print("Sum of ODD no. from 1 to 30:"+sum);
    }
    static int sum_of_odd_no()
    {
        int i,s=0;
        for(i=1;i<=30;i+=2)
        {
            System.out.println(i);
            s=s+i;
        }
        return s;
    }
}
