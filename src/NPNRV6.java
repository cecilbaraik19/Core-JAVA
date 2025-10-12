//Perfect Square Number Program in No Parameter & No Return Value Function
import java.util.*;
public class NPNRV6 {
    static void disp()
    {
        Scanner input = new Scanner(System.in);
        int n,s=0,i;
        System.out.print("Enter any No.:");
        n=input.nextInt();
        for(i=1;i<n;i++)
        {
            if(i*i==n)
            {
               s=1;
               break;
            }
        }
        if(s==1)
        {
            System.out.println("This is a Perfect Square Number");
        }
        else {
            System.out.println("This is NOT a Perfect Square Number");
        }
    }

    public static void main(String[] args) {
        disp();
    }
}
