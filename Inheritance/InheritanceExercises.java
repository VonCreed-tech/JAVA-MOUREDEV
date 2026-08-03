package Inheritance;

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
    }
    
}
