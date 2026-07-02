public class Mobile {
    //data member brand,price
    String brand;
    int price;
    public static void main(String[] args) {
        //object creation
        Mobile m1=new Mobile();
        m1.brand="iphone 16 pro";
        m1.price=175000;
        Mobile m2=new Mobile();
        m2.brand="vivo v30";
        m2.price=40000;
        System.out.println("mobile details:");
        System.out.println("1 " + m1.brand);
        System.out.println(m1.price);
        System.out.println("2 " + m2.brand);
        System.out.println(m2.price);
        //recommanded budget friendly or not
        if(m1.price<m2.price){
            System.out.println(m1.price+ " Budget friendly");
        }
        else{
            System.out.println(m2.price + " Budget friendly");
        }
    }
}
