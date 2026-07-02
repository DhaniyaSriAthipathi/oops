class Student {
    //data member as name,rollno,department
    String name;
    int rollno;
    String department;
     public static void main(String[] args)
    {
        Student obj=new Student();
        obj.name="RANJITH";
        obj.rollno=101;
        obj.department="AI&DS";
        System.out.println("Student details");
        System.out.println(obj.name);
        System.out.println(obj.rollno);
        System.out.println(obj.department);

    }
    
} 
   
