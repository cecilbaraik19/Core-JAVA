// Program for finding area of triangle
import java.util.*;
public class Abc27_TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int base,height;
        double area;
        System.out.println("Enter the Base and Height of Triangle");
        base = input.nextInt();
        height = input.nextInt();
        System.out.println("Value of Base   :"+base);
        System.out.println("Value of Height :"+height);
         area = .50*base*height;
        System.out.println("Area of Triangle:"+area);
    }
}
