//Nested Loop Program to display Prime No. from 1 to 100
import java.util.*;
public class NestedLoop_PrimeNo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i, n, c = 0;
        System.out.println("Prime No. from 1 to 100");
        for (n = 1; n <= 100; n++) {
            for (i = 1; i <= n; i++) {
                if (n % i == 0) {
                    c++;
                }
            }
            if (c == 2) {
                System.out.print(n + " ");
            }
            c = 0;
        }
    }
}
