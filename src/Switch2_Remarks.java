//Switch Case Program for Grade Remarks
import java.util.*;
public class Switch2_Remarks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char grade;
        System.out.println("Enter the Grade");
        grade = input.nextLine().charAt(0);
        switch(grade)
        {
            case 'A':
            case 'a':
                System.out.println("Excellent");
            break;
            case 'B':
            case 'b':
                System.out.println("Very Good");
            break;
            case 'C':
            case 'c':
                System.out.println("Good");
            break;
            default:
                System.out.println("Invalid Grade");
            break;
        }
    }
}
