// Series: 0 3 8 15 ................
import java.util.*;
public class Series4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,i=1;
        System.out.println("Enter Term");
        n = input.nextInt();
        do {
            System.out.print(i*i-1+ " ");
            i++;
        }
        while(i<=n);
    }
}
