//functional interface
interface A{
    void disp();
}
public class Heloo {
    public static void main(String[] args) {
        A obj=new A(){
            public void disp(){
                System.out.println("Hello");
            }
        }
        obj.disp();
    }
    
}
