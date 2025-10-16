//Call By Value Method Program
import java.util.*;
public class CallByValueMethod {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b;
        System.out.println("Enter the Value of a & b");
        a=input.nextInt();
        b=input.nextInt();
        System.out.println("Value of a before function:"+a);
        System.out.println("Value of b before function:"+b);
        disp(a,b);
        System.out.println("Value of a after function:"+a);
        System.out.println("Value of b after function:"+b);
    }
    static void disp(int a,int b)
    {
        a=a+10;
        b=b+10;
        System.out.println("Value of a inside function:"+a);
        System.out.println("Value of b inside function:"+b);
    }
}
