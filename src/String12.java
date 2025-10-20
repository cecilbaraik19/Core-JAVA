import java.util.*;
class CountSpace{
    String str;
    int i,count=0,l;
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
            if(ch==' '){
                count++;
            }
        }
        System.out.println("Total space between strings:"+count);
    }
}
public class String12 {
    public static void main(String[] args) {
        CountSpace ob = new CountSpace();
        ob.get();
    }
}
