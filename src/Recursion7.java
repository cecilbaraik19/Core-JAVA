//Recursion:Program to Print Sum of First Ten Number
public class Recursion7 {
    public static void main(String[] args) {
        SumOfFirstTenNo(1,0);
    }
    static void SumOfFirstTenNo(int i,int s){
        if(i<=10){
            System.out.println(i);
            s=s+i;
            SumOfFirstTenNo(i+1,s);
        }
        else{
            System.out.println("Sum of First Ten No.:"+s);
        }
    }
}
