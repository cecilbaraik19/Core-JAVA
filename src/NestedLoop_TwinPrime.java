//Nested Loop: Program for Twin Prime no. from 1 to 100
import java.util.Scanner;

public class NestedLoop_TwinPrime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i, n, c = 0, a = 0;
        System.out.println("Twin Prime No. from 1 to 100");
        for (n = 1; n <= 100; n++) {
            for (i = 1; i <= n; i++) {
                if (n % i == 0) {
                    c++;
                }
            }
            if (c == 2) {
                if(n-a==2)
                {
                    System.out.print("("+a+","+n+")");
                }
                a=n;
            }
            c = 0;
        }
    }
}
