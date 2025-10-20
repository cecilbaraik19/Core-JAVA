import java.util.*;
class CountWords{
    String str;
    int i,count=1,l;
    char ch;
    void get(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any String");
        str=input.nextLine();
        System.out.println("String is :"+str);
        l=str.length();
        System.out.println("Length of the String :"+l);
        for(i=0;i<l;i++){
            if(str.charAt(i)==' ' && str.charAt(i+1)!=' '){
                count = count+1;
            }
        }
        System.out.println("Total Words    :"+count);
    }
}
public class String11 {
    public static void main(String[] args) {
        CountWords ob = new CountWords();
        ob.get();
    }
}
