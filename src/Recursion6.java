//Recursion:Program to Print Even no. from 100 to 70
public class Recursion6 {
    public static void main(String[] args) {
        disp(100);
    }
    static void disp(int i){
        if(i>=70){
            System.out.println(i);
            disp(i-2);
        }
    }
}
