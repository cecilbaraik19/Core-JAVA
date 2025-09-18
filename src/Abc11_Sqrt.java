import java.util.*;
public class Abc11_Sqrt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b;
        double r;
        System.out.println("Enter the value of a & b");
        a = input.nextInt();
        b = input.nextInt();
        r = Math.sqrt(Math.pow(a+b,3));
        System.out.println("Result         :"+String.format("%.3f",r));
    }
}
