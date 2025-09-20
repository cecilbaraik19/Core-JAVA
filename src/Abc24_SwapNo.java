//Swap no. without using the third variable
import java.util.*;
public class Abc24_SwapNo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b;
        System.out.println("Enter the value of a & b");
        a = input.nextInt();
        b = input.nextInt();
        System.out.println("Value of a :"+a);
        System.out.println("Value of b :"+b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Value of a after Swap :"+a);
        System.out.println("Value of b after Swap :"+b);
    }
}
