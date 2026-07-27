package Loops;

import java.util.ArrayList;
import java.util.HashSet;

/*1. Imprime los números del 1 al 10 usando while. 

2. Usa do-while para mostrar todos los valores de un ArrayList. 

3. Imprime los múltiplos de 5 del 1 al 50 usando for. 

4. Recorre un Array de 5 números e imprime la suma total. 

5. Usa un for para recorrer un Array y mostrar sus valores. 

6. Usa for-each para recorrer un HashSet y un HashMap. 

7. Imprime los números del 10 al 1 (descendiente) con un bucle 
for. 

8. Usa continue para saltar los múltiplos de 3 del 1 al 20. 

9. Usa break para detener un bucle cuando encuentres un número 
negativo en un array. 

10. Crea un programa que calcule el factorial de un número 
dado */

public class LoopExercises {
    public static void main(String[] args){
        System.out.println("___________________________");
        //exercise 1
        int counter = 0;
        int numbers = 1;

        while (counter < 10){
            System.out.println(numbers);
            numbers++;
            counter++;
        }
        System.out.println("___________________________");
        //exercise 2
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Rayo Mcqueen");
        cars.add("Dino");
        cars.add("Mate");
        cars.add("Francesco");


        int counter2 = 0;
        do{
            System.out.println(cars.get(counter2));
            counter2++;

        }while(counter2 < cars.size());

        System.out.println("___________________________");
        //exercise 3
        for (int multiplesOf5 = 1,  digit = 1 , five = 5;  multiplesOf5 <= 50; digit++){
            System.out.println(multiplesOf5);
            multiplesOf5 = digit * five;

        }

        System.out.println("___________________________");
        //exercise 4
        int[] numbersList = {1, 2, 3, 4};
        int sum = 0;

        for (int i = 0; i < numbersList.length; i++){
            sum += numbersList[i];
        }
        System.out.println(sum);
            

        System.out.println("___________________________");
        //exercise 6
        HashSet<String> books = new HashSet<>();
        books.add("1984");
        books.add("To Kill a Mockingbird");
        books.add("El principito");

        for (String book : books) {
            System.out.println(book);
        }



        }
    }


