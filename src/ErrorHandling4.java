//Nested try catch block
class ee4{
    int a=40,b=0,c=0;
    int arr[] = new int[40];
    void disp(){
        try{
            try{
                c=a/b;
                System.out.println("Result  :"+c);
            }
            catch(ArithmeticException e1){
                System.out.println(e1);
            }
            arr[45]=34352;
            System.out.println("Value of arr[45]="+arr[45]);
        }
        catch (ArrayIndexOutOfBoundsException e2){
            System.out.println(e2);
        }
        finally {
            System.out.println("This message is from final block");
        }
    }
}
public class ErrorHandling4 {
    public static void main(String[] args) {
        ee4 ob = new ee4();
        ob.disp();
    }
}
