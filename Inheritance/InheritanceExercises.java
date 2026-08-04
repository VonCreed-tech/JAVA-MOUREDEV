package Inheritance;

import AccesModificators.classes;

public class InheritanceExercises {

    public static void main(String[] args) {
        //Exercise 1
        Car mitsubishi = new Car();
        mitsubishi.move();

        //Exercise 2
        Student student1 = new Student("Ignacio", 23,  0);
        student1.study();

        //Exercise 3
        Cat bigCat = new Cat();
        bigCat.makeSound();
        Dog bigDog= new Dog();
        bigDog.makeSound();       

        //Exercise 4
        Manager hotelManager = new Manager("Ignacio", 200000, "A");
        System.out.println(hotelManager);

        //Exercise 5
        Circle redCircle = new Circle(2);
        redCircle.calculateArea();

        Rectangle redRectangle = new Rectangle(2, 4);
        redRectangle.calculateArea();
    }
}