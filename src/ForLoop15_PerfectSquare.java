//For Loop Program to find out Perfect Square No.
import java.util.*;
public class ForLoop15_PerfectSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i,s=0,n;
        System.out.println("Enter any No.");
        n = input.nextInt();
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
            System.out.println("This is a Perfect Square No.");
        }
        else{
            System.out.println("This is NOT a Perfect Square No.");
        }
    }
}
