//While Loop Program to convert Octal No. into Decimal No.
import java.util.Scanner;

public class WhileLoop_OctToDec {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dn=0,a=1,num,n,d;
        System.out.println("Enter any Octal No.");
        num = input.nextInt();
        n=num;
        while(n>0)
        {
            d=n%10;
            dn=dn+d*a;
            a=a*8;
            n=n/10;
        }
        System.out.println("Binary No. of "+num+ " is "+dn);
    }
}
