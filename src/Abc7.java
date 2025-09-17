import java.util.*;
public class Abc7 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        String name;
        int roll;
        System.out.println("Enter Roll No.");
        roll = sc.nextInt();
        System.out.println("Enter Name");
        sc.nextLine();
        name = sc.nextLine();
        System.out.println("Name          :"+name);
        System.out.println("Roll No.      :"+roll);
    }
}
