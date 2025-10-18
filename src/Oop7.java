//Object Oriented Programming:Function Overloading
import java.util.*;
class aa7{
    int a,b;
    double c,d;
    void get(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two Integer Value");
        a=input.nextInt();
        b=input.nextInt();
        System.out.println("Enter two Double Value");
        c=input.nextDouble();
        d=input.nextDouble();
        System.out.println("1st Integer Value :"+a);
        System.out.println("2nd Integer Value :"+b);
        sum(a,b);
        System.out.println("1st Double Value  :"+c);
        System.out.println("2nd Double Value  :"+d);
        sum(c,d);
        System.out.println("One Integer Value  :"+a);
        System.out.println("One Double Value   :"+d);
        sum(a,d);
    }
    void sum(int a,int b)
    {
        System.out.println("Sum of Two Integer   :"+(a+b));
    }
    void sum(double a,double b)
    {
        System.out.println("Sum of two Double    :"+(a+b));
    }
    void sum(int a,double b)
    {
        System.out.println("Sum of One Integer & One Double :"+(a+b));
    }
}
public class Oop7 {
    public static void main(String[] args) {
        aa7 ob = new aa7();
        ob.get();
    }
}
