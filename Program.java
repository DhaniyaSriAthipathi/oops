import java.util.Scanner;
//exception handling
public class Program {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=0;
        try{
            c=a/b;
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("Program enedd"+c);
    }
}
