// String Program to Find Length, Copy, and Reverse a String
import java.util.*;

class aa18 {
    String st1, st2 = " ", st3 = " ";
    char ch;
    int i, l;

    void get() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter any String");
        st1 = input.nextLine();                 // Accept input string

        System.out.println("String is :" + st1);
        l = st1.length();                       // Find length
        System.out.println("Length of the String:" + l);

        // Loop through the string
        for (i = 0; i < l; i++) {
            ch = st1.charAt(i);                 // Get character at index i
            st2 = st2 + ch;                     // Add character to st2 (copy)
            st3 = ch + st3;                     // Reverse order into st3
        }

        System.out.println("Value of st2  :" + st2);
        System.out.println("Value of st3  :" + st3);

        input.close(); // optional but good practice
    }
}

public class String2 {
    public static void main(String[] args) {
        aa18 ob = new aa18();
        ob.get();
    }
}
