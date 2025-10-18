//Object Oriented Programming: Private to Friendly
import java.util.*;
class aa5{
    int a,b,c;
    private void get(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Value of a & b");
        a=input.nextInt();
        b=input.nextInt();
    }
    private void call()
    {
        c=a+b;
    }
    private void put(){
        System.out.println("Value of a    :"+a);
        System.out.println("Value of b    :"+b);
        System.out.println("Sum of two no. is     :"+c);
    }
    void disp(){
        get();
        call();
        put();
    }
}
public class Oop5 {
    public static void main(String[] args) {
        aa5 ob = new aa5();
        ob.disp();
    }
}
