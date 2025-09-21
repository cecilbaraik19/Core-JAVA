//For Loop - Program for any Table
import java.util.*;
public class ForLoop5_Table {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i,n;
        System.out.println("Enter any No.");
        n = input.nextInt();
        for(i=1;i<=10;i++)
        {
            System.out.println(n+" x "+i+" = "+n*i);
        }
    }
}
