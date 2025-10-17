//Recursion:Program for Table of any no.
import java.util.*;
public class Recursion3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,i=1;
        System.out.println("Enter any No.");
        n=input.nextInt();
        table(n,i);
    }
    static void table(int n,int i){
        if(i<=10){
            System.out.println(n+" x "+i+" = "+n*i);
            table(n,i+1);
        }
    }

}
