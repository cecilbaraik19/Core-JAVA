//Array type Exception
class ee2{
    int arr[] = new int[40];
    void disp(){
        try{
            arr[45]=56788;
            System.out.println("Value of arr[45 :"+arr[45]);
        }
        catch(ArrayIndexOutOfBoundsException e2){
            System.out.println(e2);
        }
    }
}
public class ErrorHandling2 {
    public static void main(String[] args) {
        ee2 ob = new ee2();
        ob.disp();
    }
}
