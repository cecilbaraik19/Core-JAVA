/*Class name pay data member String name, int basic, double da,hra
,pf,netsal,member Function--->void get()->accept the name & basic salary from user,
 void call()->da=50% of basic,hra = 30% of basic,pf=12% of basic,
 netsal = basic + da + hra - pf,void disp()-> display all information */
import java.util.*;
class pay{
    String name;
    int basic;
    double hra,pf,netsal,da;
    void get(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Name");
        name=input.nextLine();
        System.out.println("Enter basic salary");
        basic=input.nextInt();
    }
    void call(){
        da = basic*.50;
        hra = basic*.30;
        pf = basic*.12;
        netsal = basic + da + hra - pf;
    }
    void disp(){
        System.out.println("Name                 :"+name);
        System.out.println("Basic Salary         :"+basic);
        System.out.println("Dearness Allowance   :"+da);
        System.out.println("House Rent Allowance :"+hra);
        System.out.println("Net Salary           :"+netsal);
        System.out.println("Provident Fund       :"+pf);
    }
}
public class Oop6 {
    public static void main(String[] args) {
        pay ob = new pay();
        ob.get();
        ob.call();
        ob.disp();
    }
}
