//Program for checking greater than no. 50
import java.util.*;
public class Abc29_CheckGreaterNo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Enter any No.");
        n = input.nextInt();
        System.out.println(n>=50? "Yes Greater than 50" : "No Its NOT greater than 50");
    }
}
