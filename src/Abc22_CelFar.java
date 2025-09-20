// Program for converting Celsius Temperature to Fahrenheit
import java.util.*;
public class Abc22_CelFar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float c,f;
        System.out.println("Enter the Temp. in Celsius");
        c = input.nextFloat();
        f = c*9/5+32;
        System.out.println("Temp. in Fahrenheit :"+f);
    }
}
