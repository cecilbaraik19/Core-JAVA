/*Object Oriented Programming:Inheritance-->Hierarchical Inheritance,
Taking Input rrom User*/
import java.util.*;
class Area{
    int a,b;
    double ar;
    Scanner input = new Scanner(System.in);
}
class Circle extends Area{
    void AreaOfCircle(){
        System.out.println("Enter the Radius of Circle");
        a=input.nextInt();
        ar=3.14*a*a;
        System.out.println("Area of Circle   :"+ar);
    }
}
class Rectangle extends Area{
    void AreaOfRectangle(){
        System.out.println("Enter the Length and the Breadth of Rectangle");
        a=input.nextInt();
        b=input.nextInt();
        ar=a*b;
        System.out.println("Area of Rectangle  :"+ar);
    }
}
public class Oop19 {
    public static void main(String[] args) {
        Circle ob1 = new Circle();
        Rectangle ob2 = new Rectangle();
        ob1.AreaOfCircle();
        System.out.println("-----------------------------------");
        ob2.AreaOfRectangle();
    }
}
