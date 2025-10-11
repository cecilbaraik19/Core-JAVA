// Function: No Parameter No Return Value
// Static and Non Static
import java.util.*;

public class NPNRV1 {
    static void disp1() {
        Scanner input = new Scanner(System.in);
        int a, b, c;
        System.out.println("Enter the Value of a & b");
        a = input.nextInt();
        b = input.nextInt();
        System.out.println("Value of a  :" + a);
        System.out.println("Value of b  :" + b);
        c = a + b;
        System.out.println("Sum of two no. :" + c);
    }

    void disp2() {
        Scanner input = new Scanner(System.in);
        int a, b, c;
        System.out.println("Enter the Value of a & b");
        a = input.nextInt();
        b = input.nextInt();
        System.out.println("Value of a  :" + a);
        System.out.println("Value of b  :" + b);
        c = a * b;
        System.out.println("Mult of two no. :" + c);
    }

    public static void main(String[] args) {
        NPNRV1 ob = new NPNRV1();
        disp1();                   // calling static method
        ob.disp2();                // calling non-static method
    }
}
