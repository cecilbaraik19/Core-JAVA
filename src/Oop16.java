// Object Oriented Programming: Inheritance--> Single Level Inheritance
class Parents{
    int land,bankBalance;
    void get(){
        land = 100;
        bankBalance = 2000000;
    }
    void put(){
        System.out.println("Land            :"+land);
        System.out.println("Bank Balance    :"+bankBalance);
    }
}
class Son extends Parents{
    int Salary;
    void getData(){
        get();
        Salary = 5000;
    }
    void putData()
    {
        put();
        System.out.println("Salary    :"+Salary);
    }
}
public class Oop16 {
    public static void main(String[] args) {
        Son ob = new Son();
        ob.getData();
        ob.putData();
    }
}
