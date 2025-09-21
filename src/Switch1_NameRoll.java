//SwitchCase program for calling Name through Roll No.
import java.util.*;
public class Switch1_NameRoll {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int roll;
        System.out.println("Enter the Roll No.");
        roll = input.nextInt();
        switch(roll)
        {
            case 1:
                System.out.println("Annurag");
                break;
            case 2:
                System.out.println("Aakansha");
                break;
            case 3:
                System.out.println("Cecil");
                break;
            case 4:
                System.out.println("Yashi");
                break;
            default:
                System.out.println("Invalid Roll No.");
        }
    }
}
