//Switch case program for identifying the name of season according to the taking input of month number.
import java.util.*;
public class Switch4_Season {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int season;
        System.out.println("Enter any Month no. to know for Season month");
        season = input.nextInt();
        switch(season)
        {
            case 12:
            case 1:
            case 2:
                System.out.println("Winter Season");
            break;
            case 3:
                System.out.println("Spring Season");
            break;
            case 4:
            case 5:
            case 6:
                System.out.println("Summer Season");
            break;
            case 7:
            case 8:
            case 9:
                System.out.println("Monsoon Season");
            break;
            case 10:
            case 11:
                System.out.println("Autumn Season");
            break;
            default:
                System.out.println("Invalid Month No.");
        }
    }
}
