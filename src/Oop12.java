// Object Oriented Programming: An Array of Object
import java.util.*;

class aa12 {
    String name;
    int roll;
    double fee;

    void getData() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Name: ");
        name = input.nextLine();

        System.out.print("Enter Roll No.: ");
        roll = input.nextInt();

        System.out.print("Enter Fee: ");
        fee = input.nextDouble();
    }

    void putData() {
        System.out.println("Name        : " + name);
        System.out.println("Roll No.    : " + roll);
        System.out.println("Fee         : " + fee);
    }
}

public class Oop12 {
    public static void main(String[] args) {

        aa12[] ob = new aa12[3];

        // Create individual objects
        for (int i = 0; i < 3; i++) {
            ob[i] = new aa12();
            ob[i].getData();
            System.out.println("----------------------------------");
        }

        System.out.println("-----------------------------------");
        System.out.println("\t\tStudent Details");
        System.out.println("-----------------------------------");

        for (int i = 0; i < 3; i++) {
            ob[i].putData();
            System.out.println("-----------------------------------");
        }
    }
}
