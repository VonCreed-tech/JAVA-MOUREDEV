package OOP;

public class Rectangle {
    int side1;
    int side2;

    public Rectangle(int side1, int side2){
        this.side1 = side1;
        this.side2 = side2;
    }

    public int getArea(){
       int result = side1 * side2;
        System.out.println("The area is " + result);
        return result;

    }

    public int getPerimeter(){
        side1 *= 2;
        side2 *= 2;
        int result = side1 + side2;
        System.out.println("The perimeter is " + result);
        return result;
    }
}
