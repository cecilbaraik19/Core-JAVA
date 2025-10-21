//Custom Exception
import java.util.*;
class ee6{
    void get(String name)throws Exception{
        if(name.equals("Cecil")){
            throw new Exception("Wanted Wanted");
        }
        else if(name.equals("Aakansha")){
            throw new Exception("Takli");
        }
        else if(name.equals("Annurag")){
            throw new Exception("Numerologist");
        }
        else{
            System.out.println("Its OK");
        }
    }
}
public class ErrorHandling6 {
    public static void main(String[] args) {
        ee6 ob = new ee6();
        String name;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Name");
        name = input.nextLine();
        try{
            ob.get(name);
        }
        catch (Exception e1){
            System.out.println(e1);
        }
    }
}
