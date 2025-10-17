// Recursion: Program to print numbers from 1 to 10
public class Recursion1 {
    public static void main(String[] args) {
        disp(1);   // Start recursion from 1
    }

    static void disp(int i) {
        if (i <= 10) {
            System.out.println(i);
            disp(i + 1);   // Recursive call
        }
    }
}
