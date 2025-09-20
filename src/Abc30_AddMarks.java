// Program for adding 5 marks
import java.util.*;
public class Abc30_AddMarks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mar1,mar2,mar3,mar4,mar5,sum;
        System.out.println("Enter the marks of mar1,mar2,mar3,mar4,mar5");
        mar1 = input.nextInt();
        mar2 = input.nextInt();
        mar3 = input.nextInt();
        mar4 = input.nextInt();
        mar5 = input.nextInt();
        sum = mar1+mar2+mar3+mar4+mar5;
        float per = (float)sum/5;
        System.out.println("The Sum of Five Marks  :"+sum);
        System.out.println("Percentage             :"+per);
    }
}
