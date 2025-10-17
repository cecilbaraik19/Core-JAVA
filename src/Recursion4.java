//Recursion:Program for Factorial for any Number
import java.util.*;
public class Recursion4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,f;
        System.out.println("Enter any No.");
        n=input.nextInt();
        f=fact(n);
        System.out.println("Factorial of "+n+" is "+f);
    }
    static int fact(int n)
    {
        if(n==1){
            return 1;
        }
        else{
            return n*fact(n-1);
        }
    }
}
