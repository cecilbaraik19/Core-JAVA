//String Palindrome
import java.util.*;

class aa22 {
    String st1, st2;

    void getData() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter any string in LowerCase:");
        st1 = input.nextLine();

        System.out.println("Enter any string in UpperCase:");
        st2 = input.nextLine();

        System.out.println("\nString in LowerCase    : " + st1);
        System.out.println("String in UpperCase    : " + st2);

        System.out.println("\nCompare between both strings:");
        System.out.println(st1.compareTo(st2));

        System.out.println("Compare between both strings (Ignore Case):");
        System.out.println(st1.compareToIgnoreCase(st2));

        System.out.println("Both strings are equal: " + st1.equals(st2));
        System.out.println("Both strings are equal (Ignore Case): " + st1.equalsIgnoreCase(st2));
    }
}

public class String6 {
    public static void main(String[] args) {
        aa22 ob = new aa22();
        ob.getData();
    }
}
