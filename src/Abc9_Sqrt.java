import java.util.*;
public class Abc9_Sqrt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        double r;
        System.out.println("Enter any no.");
        n = input.nextInt();
        r = Math.sqrt(n);
        System.out.println("Square Root of "+n+ "is "+r);
    }
}
