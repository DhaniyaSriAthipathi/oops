interface Plaything {
   void play();
}
class Guitar implements Plaything{
    public void play(){
        System.out.println("play guitar");
    }
}
class Piano implements Plaything{
    public void play(){
        System.out.println("play paino");
    }
}
public class Playable{
    public static void main(String[] args) {
        Piano p1=new Piano();
        p1.play();
        Guitar pi=new Guitar();
        pi.play();

    }

}