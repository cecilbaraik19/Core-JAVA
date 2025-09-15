import java.util.*;
public class Abc1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char grade;
        int roll;
        float per;
        double fee;
        String name;
        System.out.println("Enter Name");
        name = input.nextLine();
        System.out.println("Enter Grade");
        grade = input.nextLine().charAt(0);
        System.out.println("Enter Roll No.");
        roll = input.nextInt();
        System.out.println("Enter Percentage");
        per = input.nextFloat();
        System.out.println("Enter Fee");
        fee = input.nextDouble();
        System.out.println("-----------------------------------------");
        System.out.println("Name                    :"+name);
        System.out.println("Roll                    :"+roll);
        System.out.println("Percentage              :"+per);
        System.out.println("Grade                   :"+grade);
        System.out.println("Fee                     :"+fee);
    }
}
