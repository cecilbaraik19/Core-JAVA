//Bubble Sort with String
import java.util.*;

class aa24 {
    String st[] = new String[10];
    String temp;
    int i, j;

    void get() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 10 Names:");
        for (i = 0; i < 10; i++) {
            st[i] = input.nextLine();
        }

        // Sorting logic (Bubble Sort)
        for (i = 0; i < 9; i++) {
            for (j = i + 1; j < 10; j++) {
                if (st[i].compareTo(st[j]) > 0) {
                    temp = st[i];
                    st[i] = st[j];
                    st[j] = temp;
                }
            }
        }

        System.out.println("\nNames after Sorting:");
        for (i = 0; i < 10; i++) {
            System.out.println(st[i]);
        }
    }
}

public class String8 {
    public static void main(String[] args) {
        aa24 ob = new aa24();
        ob.get();
    }
}
