// Parameter & No Return Value Function: Program for Swapping no. without using 3rd variable
import java.util.*;
public class PNRV2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b;
        System.out.println("Enter the value of a & b");
        a=input.nextInt();
        b=input.nextInt();
        System.out.println("Value of a:"+a);
        System.out.println("Value of b:"+b);
        swap(a,b);
    }
    static void swap(int a,int b){
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("Value of a after swap :"+a);
        System.out.println("Value of b after swap :"+b);
    }
}
