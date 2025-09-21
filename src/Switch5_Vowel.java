//Upper case vowel and Lower case vowel
import java.util.*;
public class Switch5_Vowel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char vowel;
        System.out.println("Enter any Vowel");
        vowel = input.nextLine().charAt(0);
        switch(vowel)
        {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("LowerCase Vowel");
                break;
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("UpperCase Vowel");
                break;
            default:
                System.out.println("Invalid Vowel");
        }
    }
}
