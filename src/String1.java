//String Program for Displaying First name & Last name
import java.util.*;
class aa17{
    String fn,ln,name;
    void get(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your First Name:");
        fn=input.nextLine();
        System.out.println("Enter your Last Name");
        ln=input.nextLine();
        System.out.println("First Name  :"+fn);
        System.out.println("Last Name   :"+ln);
        name = fn+" "+ln;
        System.out.println("Full Name  :"+name);
    }
}
public class String1 {
    public static void main(String[] args) {
        aa17 ob = new aa17();
        ob.get();
    }
}
