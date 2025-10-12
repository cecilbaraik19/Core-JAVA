//Prime Number Program in No Parameter & No Return Value Function
import java.util.*;
public class NPNRV4 {
    static void disp()
    {
        Scanner input = new Scanner(System.in);
        int n,c=0,i;
        System.out.print("Enter any No.:");
        n=input.nextInt();
        for(i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                c++;
            }
        }
        if(c==2)
        {
            System.out.println("This is a Prime Number");
        }
        else {
            System.out.println("This is NOT a Prime Number");
        }
    }

    public static void main(String[] args) {
        disp();
    }
}
