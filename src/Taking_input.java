import java.util.*;
public class Taking_input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter the Value of a");
        a = input.nextInt();
        System.out.println("Enter the value of b");
        b = input.nextInt();
        System.out.println("Value of a      :"+a);
        System.out.println("Value of b      :"+b);
        c = a+b;
        System.out.println("Value of c      :"+c);
    }
}
