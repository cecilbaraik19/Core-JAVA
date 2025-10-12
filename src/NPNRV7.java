//Reverse number Program in No Parameter & No Return Value Function
import java.util.*;
public class NPNRV7 {
    static void disp(){
        Scanner input = new Scanner(System.in);
        int n,num,rev=0,d;
        System.out.print("Enter any no.:");
        num=input.nextInt();
        n=num;
        while(n>0)
        {
            d=n%10;
            rev=rev*10+d;
            n=n/10;
        }
        System.out.print("Reverse No.:"+rev);
    }

    public static void main(String[] args) {
        disp();
    }
}
