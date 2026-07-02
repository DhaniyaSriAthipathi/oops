public class Book {
    //data member title,writer 
    String title;
    String writer;
    public static void main(String[] args) {
        //object creations
        Book b1=new Book();
        b1.title="The Alchemist";
        b1.writer="Paulo Coelho";
        Book b2=new Book();
        b2.title="Wings of fire";
        b2.writer="A.P.J.Abdul Kalam";
        System.out.println("Book details:");
        System.out.println("1"+ b1.title);
        System.out.println(b1.writer);
        System.out.println("2"+ b2.title);
        System.out.println(b2.writer);
        
    }
}
