/*College Management

Classes:

Student
Professor
Course

Enroll students into courses.

Concept: Aggregation */
class Student1{
    String name="Dhaniya";
}
class Professor1{
    String name="Dr.Rnjith";
}
class Course{
    void display(Student1 student,Professor1 professor){
        System.out.println("Course details:"+"B.tech");
        System.out.println("Student details:"+student.name);
        System.out.println("Professor details:"+professor.name);

    }
}
public class Main10 {
    public static void main(String[] args) {
        Student1 student=new Student1();
        Professor1 professor=new Professor1();
        Course co1=new Course();
        co1.display(student,professor);
    }
}
