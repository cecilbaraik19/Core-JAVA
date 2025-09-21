//Program for Discount on Purchase amount
import java.util.*;
public class Abc33_Purchase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double pa=0,da=0;
        System.out.println("Enter Purchase Amount");
        pa = input.nextDouble();
        if(pa<=5000)
        {
            da = pa*.10;
        }
        else if(pa<=10000)
        {
            da = pa*.15;
        }
        else if(pa<=15000)
        {
            da = pa*.20;
        }
        else if(pa<=20000)
        {
            da = pa*.25;
        }
        else if(pa>20000)
        {
            da = pa*.30;
        }
        System.out.println("Purchase Amount        :"+pa);
        System.out.println("Discount Amount        :"+da);
        System.out.println("Payment Amount         :"+(pa-da));
    }
}
