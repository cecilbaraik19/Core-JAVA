// Minimum number from three different numbers using Conditional Operator/Ternary Operator
import java.util.*;
public class Abc28_MinNo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b,c,min;
        System.out.println("Enter three different no.");
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        min = a<b&&a<c?a:b<c?b:c;
        System.out.println("Minimum Number :"+min);
    }
}
