// Object Oriented Programming: Passing Parameters

import java.util.*;

class aa10 {
    int a, b, c;

    void get(int x, int y) {
        a = x;
        b = y;
    }

    void put() {
        System.out.println("Value of a   :" + a);
        System.out.println("Value of b   :" + b);
        c = a + b;
        System.out.println("Sum of two no.:" + c);
    }
}

public class Oop10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        aa10 ob = new aa10();

        System.out.println("Enter two no.");
        ob.get(input.nextInt(), input.nextInt());
        ob.put();

        input.close();
    }
}
