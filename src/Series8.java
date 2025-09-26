//Series 1-2+3-4+5........+-n
import java.util.*;
public class Series8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, i = 1, s = 0;
        System.out.println("Enter Term");
        n = input.nextInt();

        do {
            if (i % 2 == 1) {
                System.out.print(i);
                s = s - i;
                if (i < n) System.out.print(" - ");
            } else {
                System.out.print(i);
                s = s + i;
                if (i < n) System.out.print(" + ");
            }
            i++;
        } while (i <= n);

        System.out.println(" = " + s);
    }
}
