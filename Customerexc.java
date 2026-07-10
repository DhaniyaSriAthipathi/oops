import java.util.*;
class InvalidageException extends Exception{
    public InvalidageException(String message){
        super();
    }
    class Agevalid{
        void checkage(int age){
        try{
            if(age<1 || age>100){
                throw new InvalidageException("void");
            }
            else{
                System.out.println("valid");
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    
    }
    }
}
public class Customerexc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        InvalidageException.Agevalid a1=new InvalidageException.Agevalid();
        a1.checkage(age);
    }
}
