// Object Oriented Programming: Inheritance--> Multilevel Inheritance
class Jan{
    int a;
    void get1(){
        a=1000;
    }
    int put1(){
        return a;
    }
}
class Feb extends Jan{
    int b;
    void get2(){
        get1();
        b=2000;
    }
    int put2(){
        b=b+put1();
        return b;
    }
}
class Mar extends Feb{
    int c ;
    void get3(){
        c=3000;
        get2();
    }
    int put3(){
        c=c+put2();
        return c;
    }
}
class Apr extends Mar{
    int d;
    void get4(){
        d=4000;
        get3();
    }
    void put4()
    {
        d=d+put3();
        System.out.println("Sum of all data   :"+d);
    }
}
public class Oop17 {
    public static void main(String[] args) {
        Apr ob = new Apr();
        ob.get4();
        ob.put4();
    }
}
