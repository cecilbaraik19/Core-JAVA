// String Program to Convert Uppercase to Lowercase and Vice Versa
import java.util.*;

class aa19 {
    String st1;
    char ch;
    int i, l, ac;

    void get() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter any String:");
        st1 = input.nextLine();

        System.out.println("String is: " + st1);

        l = st1.length();
        System.out.println("String after Conversion:");

        for (i = 0; i < l; i++) {
            ch = st1.charAt(i);
            ac = ch;

            if (ac >= 65 && ac <= 90) {             // Uppercase → Lowercase
                System.out.print((char) (ac + 32));
            } else if (ac >= 97 && ac <= 122) {     // Lowercase → Uppercase
                System.out.print((char) (ac - 32));
            } else {                                // Non-alphabetic characters
                System.out.print((char) ac);
            }
        }

        input.close();
    }
}

public class String3 {
    public static void main(String[] args) {
        aa19 ob = new aa19();
        ob.get();
    }
}
