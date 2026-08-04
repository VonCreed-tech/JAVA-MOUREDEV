package Inheritance;

public class Circle extends Shape {
    final double pi = 3.14 ;
    double radius;

    public Circle(double radius){
        this.radius = radius;

    }   

    @Override
    public double calculateArea(){
        double area = this.pi * this.radius;
        System.out.println("The area is " + area);
        return area;
    }
}
