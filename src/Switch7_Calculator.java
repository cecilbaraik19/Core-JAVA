//Switch case - Calculator
import java.util.*;
public class Switch7_Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b,c;
        char op;
        System.out.print("Enter Operator......");
        op = input.nextLine().charAt(0);
        System.out.println("Enter the value of a & b");
        a = input.nextInt();
        b = input.nextInt();
        switch(op)
        {
            case '+':
                c=a+b;
                System.out.println("Sum of Two No. :"+c);
                break;
            case '-':
                c=a-b;
                System.out.println("Sub of Two No. :"+c);
                break;
            case'*':
                c=a*b;
                System.out.println("Mul of Two No.:"+c);
                break;
            case'/':
                System.out.println("Div of Two No. :"+(double)(a)/(double)(b));
                break;
            case '%':
                c=a%b;
                System.out.println("Mod of Two No. :"+c);
                break;
            default:
                System.out.println("Invalid Operator");
        }
    }
}
