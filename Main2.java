/*Employee Salary

Create an Employee class.
Create subclasses:

Manager
Developer

Override calculateSalary().

Concept: Inheritance + Method Overriding */
class Employee{
    void calculateSalary(){
        System.out.println("Employee salary");
    }
}
class Manager extends Employee{
    void calculateSalary(){
        System.out.println("Manager salary:50000");
    }
}
class Developer extends Employee{
    void calculateSalary(){
        System.out.println("Developer salary :56000");
    }

}
public class Main2 {
    public static void main(String[] args) {
        Manager m1=new Manager();
        m1.calculateSalary();
        Developer d1=new Developer();
        d1.calculateSalary();
    }
    
}
