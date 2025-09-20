//Program for finding Area of Rectangle
import java.util.*;
public class Abc25_RectangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b;
        float area;
        System.out.println("Enter Length and Breadth of Rectangle");
        a = input.nextInt();
        b = input.nextInt();
        area = a*b;
        System.out.println("Area of Rectangle :"+area);
    }

}
