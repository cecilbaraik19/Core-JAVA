// Series : 1+2+3+4+...................+n
import java.util.*;
public class Series6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, s = 0, i = 1;
        System.out.println("Enter Term");
        n = input.nextInt();

        do {
            System.out.print(i);
            s = s + i;
            if (i < n) {
                System.out.print(" + ");
            }
            i++;
        } while (i <= n);

        System.out.println(" = " + s);
    }
}

