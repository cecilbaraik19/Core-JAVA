//Series : 2 5 10 17 26 ....................
import java.util.*;
public class Series5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,s=0,i=1;
        System.out.println("Enter Term");
        n = input.nextInt();
        do {
            System.out.print(i*i+1+ "  ");
            i++;
        }
        while(i<=n);
    }
}
