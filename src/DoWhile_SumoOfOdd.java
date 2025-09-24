//Do while Program of Sum of ODD no. from 20 to 40
import java.util.*;
public class DoWhile_SumoOfOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i=20,s=0;
        System.out.println("Sum of ODD no. from 20 to 40");
        do{
            if(i%2==1)
            {
                System.out.print(i+" ");
                s=s+i;
            }
            i++;
        }
        while(i<=40);
        System.out.println("\b= "+s);
    }
}
