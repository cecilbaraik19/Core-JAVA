//Switch Case Program for Finding the area of Circle, Rectangle and Triangle
import java.util.*;
public class Switch6_Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b,ch;
        double area;
        System.out.println("1 for Area of Circle");
        System.out.println("2 for Area of Triangle");
        System.out.println("3 for Area o Rectangle");
        System.out.print("Enter your Choice..........");
        ch = input.nextInt();
        switch(ch)
        {
            case 1:
                System.out.println("Enter the Radius of Circle");
                a = input.nextInt();
                area = 3.14*a*a;
                System.out.println("Area of Circle :"+area);
                break;
            case 2:
                System.out.println("Enter the Base and Height of Triangle");
                a = input.nextInt();
                b = input.nextInt();
                area = .50*a*b;
                System.out.println("Area of Triangle :"+area);
                break;
            case 3:
                System.out.println("Enter Length and Breadth of Rectangle");
                a = input.nextInt();
                b = input.nextInt();
                area = a*b;
                System.out.println("Area of Rectangle :"+area);
                break;
            default:
                System.out.println("Invalid Option");
        }
    }
}
