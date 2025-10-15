// Parameter & No Return Value Function: Program for finding the value of HCF and LCM
import java.util.*;

public class PNRV1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b;

        System.out.println("Enter two different numbers: ");
        a = input.nextInt();
        b = input.nextInt();

        System.out.println("Value of a: " + a);
        System.out.println("Value of b: " + b);

        hcf_lcm(a, b);  // function call with parameters
    }

    static void hcf_lcm(int a, int b) {   // function definition with parameters
        int hcf = 0, lcm = 0, m, i;

        // Find the smaller number
        m = (a < b) ? a : b;

        // Loop to find HCF
        for (i = 1; i <= m; i++) {
            if (a % i == 0 && b % i == 0) {
                hcf = i;
            }
        }

        // Formula: LCM × HCF = a × b
        lcm = (a * b) / hcf;

        System.out.println("HCF : " + hcf);
        System.out.println("LCM : " + lcm);
    }
}
