//Program for Fibonacci Series
import java.util.*;
public class Series3_FibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n=3,t,a=0,b=1,c=0;
        System.out.println("Enter Term");
        t = input.nextInt();
        System.out.print(a+ " ");
        System.out.print(b+ " ");
        do {
            c=a+b;
            System.out.print(c+ " ");
            a=b;
            b=c;
            n++;
        }
        while(n<=t);
    }
}
