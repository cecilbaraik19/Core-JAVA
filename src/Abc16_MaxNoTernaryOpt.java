import java.util.*;
public class Abc16_MaxNoTernaryOpt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b,c,max;
        System.out.println("Enter three different No.");
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        max = a>b&&a>c?a:b>c?b:c;
        System.out.println("Max No. is :"+max);
    }
}
