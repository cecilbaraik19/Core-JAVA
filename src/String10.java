import java.util.*;
class aa26{
    String str;
    int i,vol=0,l;
    char ch;
    void get(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any String");
        str=input.nextLine();
        System.out.println("String is :"+str);
        l=str.length();
        System.out.println("Length of the String :"+l);
        for(i=0;i<l;i++){
            char ch = str.charAt(i);
            if(ch!=' '){
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                    vol++;
                }
            }
        }
        System.out.println("Total Vowel   :"+vol);
    }
}
public class String10 {
    public static void main(String[] args) {
        aa26 ob = new aa26();
        ob.get();
    }
}
