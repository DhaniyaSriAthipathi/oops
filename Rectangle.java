class Rectangle {
    int length;
    int breadth;
    void getData(){
        length=20;
        breadth=5;
    }
    void calculateArea(){
        int area=length*breadth;
        System.out.println(area);
    }
    public static void main(String[] args)
    {
        Rectangle obj=new Rectangle();
        obj.getData();
        obj.calculateArea();
    }
    
}
