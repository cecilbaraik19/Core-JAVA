//Object Oriented Programming: Taking Input from the user
import java.util.*;
class aa4
{
    int a,b,c;
    void get(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Value of a & b");
        a=input.nextInt();
        b=input.nextInt();
    }
    void call(){
        c=a+b;
    }
    void put(){
        System.out.println("Value of a    :"+a);
        System.out.println("Value of b    :"+b);
        System.out.println("Sum of two no. is     :"+c);
    }
}
public class Oop4 {
    public static void main(String[] args) {
        aa4 ob = new aa4();
        ob.get();
        ob.call();
        ob.put();
    }
}
