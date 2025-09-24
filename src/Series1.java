import java.util.*;
// Series : 1+4+9+16+25+.........= ?
public class Series1 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int n,s=0,i=1;
        System.out.println("Enter the Term");
        n = input.nextInt();
        do{
            System.out.print(i*i + "+");
            s=s+i*i;
            i++;
        }
        while(i<=n);
        {
            System.out.println("\b="+s);
        }
    }
}
