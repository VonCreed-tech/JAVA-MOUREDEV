package DataStructures;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/*1. Crea un Array con 5 valores e imprime su longitud. 

2. Modifica uno de los valores del Array e imprime el valor del 
índice antes y después de modificarlo. 

3. Crea un ArrayList vacío. 

4. Añade 4 valores al ArrayList y elimina uno a continuación. 

5. Crea un HashSet con 2 valores diferentes. 

6. Añade un nuevo valor repetido y otro sin repetir al HashSet. 

7. Elimina uno de los elementos del HashSet. 

8. Crea un HashMap donde la clave sea un nombre y el valor el 
número de teléfono. Añade tres contactos. 

9. Modifica uno de los contactos y elimina otro. 

10. Dado un Array, transfórmalo en un ArrayList, a 
continuación en un HashSet y finalmente en un HashMap con 
clave y valor iguales. */

public class StructureExercises {

    public static void main(String[] args){

        //exercise 1
        String[] names = {"Ignacio","Andres","Madriaga","Rojas","Piña"};
        System.out.println(names.length);
        System.out.println("------------------------------------------");

        //exercise 2
        System.out.println(names[0]);
        names[0] = "Federico";
        System.out.println(names[0]);
        System.out.println("------------------------------------------");

        //exercise 3
        ArrayList<Integer> numbers = new ArrayList<>();

        //exercise 4
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        System.out.println(numbers.size());
        numbers.remove(1);
        System.out.println(numbers.size());

        System.out.println("------------------------------------------");
        //exercise 5
        HashSet<String> conditions = new HashSet<>();
        conditions.add("Ignacio");
        conditions.add("Madriaga");

        System.out.println(conditions);

        //exercise 6
        System.out.println("------------------------------------------");
        conditions.add("Ignacio");
        conditions.add("Rojas");
        System.out.println(conditions);

        System.out.println("------------------------------------------");
        //exercise 7
        conditions.remove("Ignacio");
        System.out.println(conditions);

        System.out.println("------------------------------------------");
        //exercise 8
        HashMap<String, Integer> userPhones = new HashMap<>();

        userPhones.put("Ignacio", 77032751);
        userPhones.put("Marco", 95492089);
        userPhones.put("Carolina", 61305629);
        System.out.println(userPhones);

        System.out.println("------------------------------------------");
        //exercise 9
        userPhones.replace("Ignacio", 77032756);
        userPhones.remove("Marco");
        System.out.println(userPhones);

        //exercise 10
        String[] myName = {"Ignacio"};

        new ArrayList<>(Arrays.asList(myName));
        





        












        
    }

    
}
