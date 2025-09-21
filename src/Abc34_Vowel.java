// Program for upper vowel and lower vowel
import java.util.*;
public class Abc34_Vowel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch;
        System.out.println("Enter any Character");
        ch = input.nextLine().charAt(0);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
        {
            System.out.println("Lower Vowel");
        }
        else if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
        {
            System.out.println("Upper Vowel");
        }
        else {
            System.out.println("Its NOT a Vowel But Consonant");
        }
    }
}
