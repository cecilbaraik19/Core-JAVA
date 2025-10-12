//No Parameter & Return Value Function Program: Sum of Even Number from 100 to 70
import java.util.*;
public class NPRV3 {
    public static void main(String[] args) {
        int sum;
        sum=sum_of_even_no();
        System.out.print("Sum of Even no. from 100 to 70:"+sum);
    }
    static int sum_of_even_no()
    {
        int i,s=0;
        for(i=100;i>=70;i-=2)
        {
            System.out.println(i);
            s=s+i;
        }
        return s;
    }
}
