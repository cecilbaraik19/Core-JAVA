//Recursion:Program to Print ODD no. from 1 to 30
public class Recursion5 {
    public static void main(String[] args) {
        disp(1);
    }
    static void disp(int i){
        if(i<=30){
            System.out.println(i);
            disp(i+2);
        }
    }
}
