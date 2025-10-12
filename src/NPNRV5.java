//Perfect Number Program in No Parameter & No Return Value Function
import java.util.*;
public class NPNRV5 {
    static void disp()
    {
        Scanner input = new Scanner(System.in);
        int n,s=0,i;
        System.out.print("Enter any No.:");
        n=input.nextInt();
        for(i=1;i<n;i++)
        {
            if(n%i==0)
            {
                s=s+i;
            }
        }
        if(s==n)
        {
            System.out.println("This is a Perfect Number");
        }
        else {
            System.out.println("This is NOT a Perfect Number");
        }
    }

    public static void main(String[] args) {
        disp();
    }
}
