//Recursion: Program to print square of first ten no.
public class Recursion2 {
    public static void main(String[] args) {
        disp(1);
    }
    static void disp(int i){
        if(i<=10){
            System.out.println(i*i);
            disp(i+1);
        }
    }
}
