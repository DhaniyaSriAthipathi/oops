/*Animal Sound

Create an interface Animal.
Methods:

sound()
eat()

Implement:

Dog
Cat
Cow

Concept: Interface + Polymorphism */
interface Animal{
    void sound();
    void eat();
}
class Dog implements Animal{

    @Override
    public void sound() {
        System.out.println("Bow Bow...");
    }

    @Override
    public void eat() {
        System.out.println("chicken");
    }

}
class Cat implements Animal{

    @Override
    public void sound() {
        System.out.println("Meow Meow...");
    }

    @Override
    public void eat() {
        System.out.println("milk");
    }

}
class Cow implements Animal{

    @Override
    public void sound() {
        System.out.println("maaaa...");
    }

    @Override
    public void eat() {
        System.out.println("Grass");
    }

}
public class Main4 {
    public static void main(String[] args) {
        Dog d1=new Dog();
        d1.eat();
        d1.sound();
        Cat c1=new Cat();
        c1.eat();
        c1.sound();
        Cow o1=new Cow();
        o1.eat();
        o1.sound();
    }
}
