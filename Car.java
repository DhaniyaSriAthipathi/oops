public class Car {
    //data member as model,brand
    String brand;
    int model;
    public static void main(String[] args) {
        //object creation
        Car c1=new Car();
        c1.brand="BMW";
        c1.model=2025;
        System.out.println("Car details");
        System.out.println(c1.brand);
        System.out.println(c1.model);

    }
}
