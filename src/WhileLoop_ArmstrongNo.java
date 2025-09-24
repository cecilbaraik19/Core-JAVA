//While Loop Program to find Armstrong No.
import java.util.*;
public class WhileLoop_ArmstrongNo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num,n,d,sum=0;
        System.out.println("Enter any no.");
        num = input.nextInt();
        n=num;
        while(n>0)
        {
            d=n%10;
            sum=sum+d*d*d;
            n=n/10;
        }
        if(sum==num)
        {
            System.out.println("Given No. is Armstrong No.");
        }
        else {
            System.out.println("Given No. is NOT a Armstrong No.");
        }
    }
}
