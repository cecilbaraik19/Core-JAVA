//Factorial Number Program in No Parameter & No Return Value
import java.util.*;
public class NPNRV3 {
    static void disp(){
        Scanner input = new Scanner(System.in);
        int n,f=1;
        System.out.print("Enter any No.:");
        n=input.nextInt();
        for(;n>0;n--)
        {
            System.out.print(n+"x");
            f=f*n;
        }
        System.out.println("\b="+f);
    }

    public static void main(String[] args) {
        disp();
    }
}
