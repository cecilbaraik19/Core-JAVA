//Array Program for Entering the Roll No. and Marks Records of Student
import java.util.*;
public class Array11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int s,i,c=0,rn;
        System.out.print("Enter how many Records:");
        s=input.nextInt();
        int roll[]=new int[s];
        int marks[]=new int[s];
        for(i=0;i<s;i++)
        {
            System.out.print("Enter Roll No.:");
            roll[i]=input.nextInt();
            System.out.print("Enter Marks:");
            marks[i]=input.nextInt();
        }
        System.out.println("-------------------------------");
        System.out.println("\t\tStudent Details");
        System.out.println("-------------------------------");
        System.out.println("Roll No.       Marks");
        for(i=0;i<s;i++)
        {
            System.out.println(roll[i]+"\t\t\t\t"+marks[i]);
        }
        System.out.print("Enter the Roll No. want to be Search......");
        rn=input.nextInt();
        for(i=0;i<s;i++)
        {
            if(roll[i]==rn)
            {
                System.out.println("Marks      :"+marks[i]);
                c++;
            }
        }
        if(c==0)
        {
            System.out.println("Given Roll No. is NOT Found");
        }
    }
}
