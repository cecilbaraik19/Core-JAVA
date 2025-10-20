import java.util.*;
class aa25{
    String st;
    void get(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any String");
        st=input.nextLine();
        System.out.println("String si :"+st);
        System.out.println("String after Replacing Space with $ :"+st.replace(' ','$'));
    }
}
public class String9 {
    public static void main(String[] args) {
        aa25 ob = new aa25();
        ob.get();
    }
}
