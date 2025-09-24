import java.util.*;
public class Series2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int s=0,n,i=1;
        System.out.println("Enter Term");
        n = input.nextInt();
        do {
            if(i%2==1)
            {
                System.out.print(i*i+ "-");
                s=s+i*i;
            }
            else
            {
                System.out.print(i*i+"+");
                s=s-i*i;
            }
            i++;
        }
        while(i<=n);
        System.out.println("\b="+s);
    }
}
