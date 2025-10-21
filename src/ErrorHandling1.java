class ee1{
    int a=40,b=0,c=0;
    void disp(){
        try{
            c=a/b;
            System.out.println("Result   :"+c);
        }
        catch(ArithmeticException e1){
            System.out.println("Div by Zero");
                    //or
            System.out.println(e1);
                    //or
            System.out.println(e1.getMessage());
        }
    }
}
public class ErrorHandling1 {
    public static void main(String[] args) {
        ee1 ob = new ee1();
        ob.disp();
    }
}
