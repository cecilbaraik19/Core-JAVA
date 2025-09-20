// Program for finding the Area of Circle
import java.util.*;
public class Abc26_CircleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a;
        double area;
        System.out.println("Enter the Radius of Circle");
        a = input.nextInt();
        area = 3.14*a*a;
        System.out.println("Area of Circle :"+area);
    }
}
