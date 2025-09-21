//For Loop - Program for finding Maximum no. from 10 No.
import java.util.*;
public class ForLoop11_MaxNo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i,n,max;
        System.out.println("Enter any 10 No.");
        n = input.nextInt();
        max = n;
        for(i=2;i<=10;i++)
        {
            n = input.nextInt();
            if(n>max)
            {
                max = n;
            }
        }
        System.out.println("Maximum No. is :"+max);
    }
}
