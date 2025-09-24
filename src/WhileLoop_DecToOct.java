//While Loop Program to convert Decimal No. into Octal
import java.util.Scanner;

public class WhileLoop_DecToOct {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int on=0,a=1,num,n,d;
        System.out.println("Enter any Decimal No.");
        num = input.nextInt();
        n=num;
        while(n>0)
        {
            d=n%8;
            on=on+d*a;
            a=a*10;
            n=n/8;
        }
        System.out.println("Octal No. of "+num+ " is "+on);
    }
}
