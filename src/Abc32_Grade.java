//If Condition program for Grade according to marks
import java.util.*;
public class Abc32_Grade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int marks;
        System.out.println("Enter Marks");
        marks = input.nextInt();
        if(marks>=90)
        {
            System.out.println("Grade A");
        }
        else if(marks>=80)
        {
            System.out.println("Grade B");
        }
        else if(marks>=70)
        {
            System.out.println("Grade C");
        }
        else if(marks>=60)
        {
            System.out.println("Grade D");
        }
        else if(marks>=45)
        {
            System.out.println("Pass");
        }
        else{
            System.out.println("Try Again");
        }
    }
}
