//Nested If Else Condition Program for Selection of Subject Stream on the basis for Marks
import java.util.*;
public class Abc37_StreamEligibility {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int marks;
        System.out.println("Enter the Marks");
        marks = input.nextInt();
        if(marks>=65 && marks<=100)
        {
            if(marks>=85)
            {
                System.out.println("Eligible for Science,Commerce and Arts");
            }
            else if(marks>=75)
            {
                System.out.println("Eligible for Commerce and Arts");
            }
            else
            {
                System.out.println("Eligible for Arts");
            }
        }
        else
        {
            if(marks>=55 && marks<65)
            {
                System.out.println("Wait for 2nd Round");
            }
            else
            {
                System.out.println("Not Eligible");
            }
        }
    }
}
