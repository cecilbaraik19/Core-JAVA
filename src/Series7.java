//Series: 1 4 3 16 5 36 ......n
import java.util.*;
public class Series7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,i=1;
        System.out.println("Enter Term");
        n=input.nextInt();
        do {
            if(i%2==0)
            {
                System.out.print(i*i+" ");
            }
            else {
                System.out.print(i+" ");
            }
            i++;
        }while(i<=n);
    }
}
