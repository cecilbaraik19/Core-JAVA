//For Loop - Program for finding out the Perfect No.
import java.util.*;
public class ForLoop14_PerfectNo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i,n,s=0;
        System.out.println("Enter any No.");
        n = input.nextInt();
        for(i=1;i<n;i++)
        {
            if(n%i==0)
            {
                s=s+i;
            }
        }
        if(s==n)
        {
            System.out.println("This is Perfect No.");
        }
        else {
            System.out.println("This is NOT a Perfect No.");
        }
    }
}
