import java.util.*;
public class Abc10_BasePower {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int b,p;
        double r;
        System.out.println("Enter Base Value & Power Value");
        b = input.nextInt();
        p = input.nextInt();
        r = Math.pow(b,p);
        System.out.println("Base Value = "+b+" Power Value = "+p+ " & Result = "+r);
    }
}
