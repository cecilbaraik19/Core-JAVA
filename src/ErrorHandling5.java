//Null Pointer Exception
class ee5{
    String st = null;
    void get(){
        try{
            System.out.println("Length of String :"+st.length());
        }
        catch(NullPointerException e1){
            System.out.println(e1);
        }
    }
}
public class ErrorHandling5 {
    public static void main(String[] args) {
        ee5 ob= new ee5();
        ob.get();
    }
}
