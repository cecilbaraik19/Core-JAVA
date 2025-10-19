import java.util.*;
class aa20{
    String st;
    void get(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any string:");
        st=input.nextLine();
        System.out.println("String is :"+st);
        System.out.println("String after replace :"+st.replace('e','a'));
    }
}
public class String4 {
    public static void main(String[] args) {
        aa20 ob = new aa20();
        ob.get();
    }
}
