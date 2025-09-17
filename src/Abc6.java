import java.sql.SQLOutput;
import java.util.*;
public class Abc6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ac;
        char ch;
        System.out.println("Enter any Character");
        ch = input.nextLine().charAt(0);
        ac = ch;
        System.out.println("ASCII value of "+ch+ " is " +ac);
        System.out.println("Enter any ASCII value");
        ac = input.nextInt();
        ch = (char)ac;
        System.out.println("Character value of "+ac+" is "+ch);
    }
}
