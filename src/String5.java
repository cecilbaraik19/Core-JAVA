// String Program to Convert Lowercase to Uppercase, Uppercase to Lowercase, and Trim Spaces
import java.util.*;

class aa21 {
    String st1, st2, st3;

    void get() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter any string in Lowercase:");
        st1 = input.nextLine();

        System.out.println("Enter any string in Uppercase:");
        st2 = input.nextLine();

        System.out.println("Enter any string with Spaces:");
        st3 = input.nextLine();

        System.out.println("\nString in Lowercase    : " + st1);
        System.out.println("String after Conversion: " + st1.toUpperCase());

        System.out.println("\nString in Uppercase    : " + st2);
        System.out.println("String after Conversion: " + st2.toLowerCase());

        System.out.println("\nString with Spaces     :" + st3 + ":");
        System.out.println("String after Trim      :" + st3.trim() + ":");

        input.close();
    }
}

public class String5 {
    public static void main(String[] args) {
        aa21 ob = new aa21();
        ob.get();
    }
}
