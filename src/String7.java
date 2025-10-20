import java.util.*;

class aa23 {
    String st1, st2 = "";
    char ch;
    int i, l;

    void get() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any String:");
        st1 = input.nextLine();
        System.out.println("Original String: " + st1);

        l = st1.length();
        st2 = ""; // ensure empty before reverse

        for (i = 0; i < l; i++) {
            ch = st1.charAt(i);
            st2 = ch + st2; // build reverse string
        }

        System.out.println("Reversed String: " + st2);

        if (st1.equals(st2)) {
            System.out.println("String is Palindrome");
        } else {
            System.out.println("String is NOT Palindrome");
        }
    }
}

public class String7 {
    public static void main(String[] args) {
        aa23 ob = new aa23();
        ob.get();
    }
}
