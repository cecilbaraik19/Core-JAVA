//No Parameter & Return Value Function Program: Sum of First Ten Number
import java.util.*;
public class NPRV1 {
    public static void main(String[] args) {
        int r;
        r=sum_of_ten_no();
        System.out.print("Sum of First ten no. is :"+r);
    }
    static int sum_of_ten_no()
    {
        int i,s=0;
        for(i=1;i<=10;i++)
        {
            System.out.println(i);
            s=s+i;
        }
        return s;
    }
}
