public class Abc13_LogicalOpt {
    public static void main(String[] args) {
        boolean a = true, b = false;
        System.out.println("Value of a     :"+a);
        System.out.println("Value of b     :"+b);
        System.out.println("Value of a&&a  :"+(a&&a));
        System.out.println("Value of a&&b  :"+(a&&b));
        System.out.println("Value of a||b  :"+(a||b));
        System.out.println("Value of b||b  :"+(b||b));
        System.out.println("Value of !a    :"+(!a));
        System.out.println("Value of !b    :"+(!b));
    }
}
