import java.util.*;
public class Abc15_ConditionalOptEx {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Enter any No.");
        n = input.nextInt();
        System.out.println("Given No. is "+(n%2==0?"Even":"Odd"));
    }
}
