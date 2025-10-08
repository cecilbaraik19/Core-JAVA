//Linear Search
import java.util.*;
public class Array4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i,c=0,num,s;
        System.out.println("Enter Array Size");
        s=input.nextInt();
        int arr[]=new int[s];
        System.out.println("Enter Array Element");
        for(i=0;i<s;i++)
        {
            System.out.print("arr["+i+"]=");
            arr[i]=input.nextInt();
        }
        System.out.println("Array Element");
        for(i=0;i<s;i++)
        {
            System.out.println(arr[i]);
        }
        System.out.print("Enter the No. want to be search....");
        num = input.nextInt();
        for(i=0;i<s;i++)
        {
            if(arr[i]==num)
            {
                c++;
                System.out.println("Position   :"+(i+1));
            }
        }
        if(c>0)
        {
            System.out.println("Given No. found : " +c+ " Time");
        }
        else {
            System.out.println("Given No. NOT found");
        }
    }
}
