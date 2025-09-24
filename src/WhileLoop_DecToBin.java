//While Loop Program to convert Decimal No. into Binary No.
import java.util.*;
public class WhileLoop_DecToBin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bn=0,a=1,num,n,d;
        System.out.println("Enter any Decimal No.");
        num = input.nextInt();
        n=num;
        while(n>0)
        {
            d=n%2;
            bn=bn+d*a;
            a=a*10;
            n=n/2;
        }
        System.out.println("Binary No. of "+num+ " is "+bn);
    }
}
