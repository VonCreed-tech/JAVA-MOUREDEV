package Polymorphism;

import java.util.ArrayList;

public class PolymorphismExercises {
    public static void main(String[] args) {
        ArrayList<Animal> animalsList = new ArrayList<>();
        animalsList.add(new Dog());
        animalsList.add(new Cat());
        animalsList.add(new Cow());

        for (Animal animal : animalsList ){
            animal.makeSound();
        }

    }
}
