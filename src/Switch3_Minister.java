import java.util.*;
public class Switch3_Minister {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;
        System.out.println("Enter the name of Minister of India");
        name = input.nextLine();
        switch(name)
        {
            case "Modi":
                System.out.println("PM of India");
            break;
            case "Soren":
                System.out.println("CM of Jharkhand");
            break;
            case "Rahul":
                System.out.println("Leader of Indian Congress");
            break;
            default:
                System.out.println("Invalid Name");
        }
    }
}
