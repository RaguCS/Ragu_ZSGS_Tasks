package Assignments.inheritance;
public class ShapeMain{
    public static void main(String[] args) {
        Shape shape =new Rectangle(4,5);
        System.out.println(shape.area());
        shape =new Triangle(4,5);
        System.out.println(shape.area());
    }
}

class Shape {
    int length;
    int breadth;
    public Shape(int length, int breadth) {
        this.length=length;
        this.breadth=breadth;
    }
    public double area(){
        return length*breadth;
    }
}
class Rectangle extends Shape {
    public Rectangle(int length, int breadth) {
        super(length, breadth);
    }
}
class Triangle extends Shape {
    public Triangle(int length, int breadth) {
        super(length, breadth);
    }
    @Override
    public double area(){
        return 0.5*length*breadth;
    }
}
