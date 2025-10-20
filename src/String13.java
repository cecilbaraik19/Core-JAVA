import java.util.*;

class shortName {
    String st1, st2 = "", st3 = "";
    char ch;
    int i, l;

    void get() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any Full Name:");
        st1 = input.nextLine();
        l = st1.length();

        for (i = 0; i < l; i++) {
            ch = st1.charAt(i);
            if (ch == ' ') { // check for space
                if (!st2.isEmpty()) { // avoid error
                    st3 = st3 + st2.charAt(0) + ".";
                    st2 = "";
                }
            } else {
                st2 = st2 + ch;
            }
        }

        // Add last word (surname)
        System.out.println("Short Name: " + st3 + st2);
    }
}

public class String13 {
    public static void main(String[] args) {
        shortName ob = new shortName();
        ob.get();
    }
}
