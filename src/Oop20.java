//Object Oriented Programming: Interface
interface details{
    public void name(String n);
    public void roll(int r);
    public void fee(double f);
    public void grade(char g);
    public void per(float p);
}
class student implements details{
    void disp(){
        System.out.println("Display All Information");
    }
    public void name(String n){
        System.out.println("Name          :"+n);
    }
    public void roll(int rn){
        System.out.println("Roll No.      :"+rn);
    }
    public void fee(double f){
        System.out.println("Fee           :"+f);
    }
    public void per(float p){
        System.out.println("Percentage    :"+p);
    }
    public void grade(char g){
        System.out.println("Grade         :"+g);
    }
}
public class Oop20 {
    public static void main(String[] args) {
        student ob = new student();
        ob.disp();
        ob.name("Cecil");
        ob.roll(19);
        ob.fee(80000);
        ob.per(99.99f);
        ob.grade('A');
    }
}
