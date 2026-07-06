/*Shape Area Calculator

Create an abstract class Shape.
Implement:

Circle
Rectangle
Triangle

Implement calculateArea().

Concept: Abstraction */
abstract class Shape{
    abstract void calculateArea();
}
class Circle extends Shape{
    double radius=35;
    @Override
    void calculateArea() {
       double area=3.14*radius*radius;
       System.out.println("Area of circle :"+area);
    }

}
class Rectangle extends Shape{
    double length=20;
    double breadth=10;
    @Override
    void calculateArea() {
        double area=length*breadth;
        System.out.println("Area of Rectangle:"+area);
    }

}
class Triangle extends Shape{
    double base=23;
    double height=10;
    @Override
    void calculateArea() {
         double area=0.50*base*height;
         System.out.println("Area of Triangle:"+area);
    }

}
public class Main3 {
    public static void main(String[] args) {
        Shape Circle=new Circle();
        Shape Rectangle=new Rectangle();
        Shape Triangle=new Triangle();
        Triangle.calculateArea();
        Circle.calculateArea();
        Rectangle.calculateArea();

    }
}
