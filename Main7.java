/*Vehicle Management

class:
Vehicle
Subclasses:

Bike
Car
Bus

Override startEngine().

Concept: Runtime Polymorphism */
class Vehicle1{
    void startEngine1(){
        System.out.println("vehicle start..");

    }
}
class Bike extends Vehicle1{
    void startEngine1(){
        System.out.println("Bike starts..");
    }
}
class Car1 extends Vehicle1{
    void startEngine1(){
        System.out.println("car engine starts..");
    }
}
class Bus extends Vehicle1{
    void startEngine1(){
        System.out.println("Bus starts...");
    }
}
public class Main7 {
    public static void main(String[] args) {
        Bike bi1=new Bike();
        bi1.startEngine1();
        Car1 ca1=new Car1();
        ca1.startEngine1();
        Bus bu1=new Bus();
        bu1.startEngine1();
    }
}
