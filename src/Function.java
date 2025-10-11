//Predefined Function of Ceil value and Floor value
import java.util.*;
public class Function {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double n,c,f;
        System.out.println("Enter any Floating point value");
        n=input.nextDouble();
        c=Math.ceil(n);
        f=Math.floor(n);
        System.out.println("Ceil Value of "+n+" is "+c);
        System.out.println("Floor Value of "+n+" is "+f);
    }
}
