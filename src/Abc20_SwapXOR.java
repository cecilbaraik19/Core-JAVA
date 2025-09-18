// Swap no. without 3rd Variable through Bitwise Operator

import java.util.*;
public class Abc20_SwapXOR {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b;
        System.out.println("Enter the value of a & b");
        a = input.nextInt();
        b = input.nextInt();
        System.out.println("Value of a  :"+a);
        System.out.println("Value of b  :"+b);
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println("Value of a after swap  :"+a);
        System.out.println("Value of b after swap  :"+b);
    }
}
