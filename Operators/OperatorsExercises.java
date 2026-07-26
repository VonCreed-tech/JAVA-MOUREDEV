package Operators;
// 1. Crea una variable con el resultado de cada operación 
// aritmética.  DONE
 
// 2. Crea una variable para cada tipo de operación de asignación. DONE

// 3. Imprime 3 comparaciones verdaderas con diferentes operadores 
// de comparación.  DONE
 
// 4. Imprime 3 comparaciones falsas con diferentes operadores de 
// comparación.  DONE
 
// 5. Utiliza el operador lógico and. DONE
 
// 6. Utiliza el operador lógico or. DONE
 
// 7. Combina ambos operadores lógicos. DONE
 
// 8. Añade alguna negación. DONE
 
// 9. Imprime 3 ejemplos de uso de operadores unarios.  DONE

// 10. Combina operadores aritméticos, de comparación y 
// lógicos. 

public class OperatorsExercises {
    public static void main(String[] args){
        int arimeticOperation = 1 + 3 + (6 - 2) - (2 * 5) + (10/2) % 2;
        System.out.println("The value of the operation is: " + arimeticOperation);

        //assignation operators

        int one = 1;
        one += 10;

        int ten = 10;
        ten -= 1;

        int five = 5;
        five *= 5;

        int eight = 8;
        eight /= 2;

        int four = 4;
        four %= 2;

        //comparison operators givin true
        System.out.println("___comparison operators givin true______");
        System.out.println("5 > 2: " + (5 > 2));
        System.out.println("5 == 5: " + (5 == 5));
        System.out.println("10 != 2: " + (10 != 2));


        //comparison operators givin false
        System.out.println("____comparison operators givin false_____");
        System.out.println("200 == 100: " + (200 == 100));
        System.out.println("10 != 10*1: " + (10 != 10*1));
        System.out.println("2 > 10: " + (2 > 10));
;

        //using and (&&) operator 
        System.out.println("____using and (&&) operator_____");
        System.out.println("true && true: " + (true && true));
        System.out.println("true && !true: " + (true && !true ) );

        //using or ( || ) operator 
        System.out.println("____using or ( || ) operator_____");
        System.out.println("true || true: " + (false || true));
        System.out.println("true || false: " + (true || false));

        //combining both 
        System.out.println("____Combining both_____");
        System.out.println("2 > 3 || true && false: " + (2 > 3 || true && false));

        //adding a negation
        System.out.println("____ adding a negation_____");
        System.out.println("true || false || !true: " + (true || false || !true));

        //unary examples
        System.out.println("Regression counter");
        int counter = 3;
        System.out.println(counter--);
        System.out.println(counter--);
        System.out.println(counter--);
        System.out.println(counter--);

        System.out.println("substracting one from 11");
        int eleven = 11;
        System.out.println(--eleven);

        System.out.println("adding one to six");
        int six = 6;
        System.out.println(++six);

        //combing everything
        System.out.println("combing everything");
        System.out.println("(1+3 > 2) || (true && false): " + ((1+3 > 2) || (true && false)) );


    } 
}
