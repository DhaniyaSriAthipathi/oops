//mulitple inheritance with interface
interface writeable {
   void write();
}
interface showable{
    void show();
}
interface readable{
    void read();
}
class Document implements writeable,showable,readable{

    @Override
    public void show() {
        System.out.println("show file");
    }

    @Override
    public void write() {
        System.out.println("write file");
    }
    public void read(){
        System.out.println("read file");
    }
}
public class Notes {
    public static void main(String[] args) {
        Document d1=new Document();
        d1.show();
        d1.read();
        d1.write();
    }
}
