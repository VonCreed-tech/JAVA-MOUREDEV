package Functions;

import java.lang.reflect.Array;

/*1. Crea una función que imprima "¡Te doy la bienvenida al curso 
de Java desde cero!". 

2. Escribe una función que reciba un nombre como parámetro y 
salude a esa persona. 

3. Haz un método que reciba dos números enteros y devuelva su 
resta. 

4. Crea un método que calcule el cuadrado de un número (n * n). 

5. Escribe una función que reciba un número y diga si es par o 
impar. 

6. Crea un método que reciba una edad y retorne true si es mayor 
de edad (y false en caso contrario). 

7. Implementa una función que reciba una cadena y retorne su 
longitud. 

8. Crea un método que reciba un array de enteros, calcula su 
media y lo retorna. 

9. Escribe un método que reciba un número y retorna su 
factorial. 

10. Crea una función que reciba un ArrayList<String> y lo 
recorra mostrando cada elemento. */

public class FunctionsExercises {
    public static void main(String[] args){
        
        sayWelcome();
        System.out.println("---------------");
        welcomeToUser("Ignacio");
        System.out.println("---------------");
        System.out.println(getSubtract(5, 2))
        ;
        System.out.println("---------------");
        System.out.println(getSquare(2));
        System.out.println("---------------");
        getEvenOrOdd(120);
        System.out.println("---------------");
        isOlder(19);
        System.out.println("---------------");
        System.out.println(getLengtghOfString("Paralelepipedo"));
        System.out.println("---------------");
        int[] intNumbers = {1,2,3,4,5,6};
        System.out.println(getAverageOfSum(intNumbers));
        System.out.println("---------------");
        System.out.println(getFactorialOfNumber(5));





        }
    //exercise 1
    public static void sayWelcome(){
        System.out.println("Welcome !");
    }

    //exercise 2
    public static void welcomeToUser(String user){
        System.out.println("Welcome " + user);
    }

    //exercise 3 
    public static int getSubtract(int number1, int number2){
        System.out.print("La resta de " + number1 + " - " + number2 + " es: ");
        return number1 - number2;
    }

    //exercise 4
    public static int getSquare(int number){
        System.out.print("El numero al cuadrado de " + number + " es ");
        return number * number;
        
    }

    //exercise 5
    public static void getEvenOrOdd(int number){
        if (number%2 == 0){
            System.out.println("The number " + number + " is even");
        }else{
            System.out.println("The number "  + number + "is odd");
        }
    }
    //exercise 6
    public static boolean isOlder(int age){
        if (age > 18){
            System.out.println(age + " Es mayor de edad");
            return true;
        } 

        System.out.println(age + " Es menor de edad");
        return false;
    }

    //exercise 7 
    public static int getLengtghOfString(String string ){

        return string.length();
    }

    //exercise 8
    public static double getAverageOfSum(int[] intNumbers){
        double sum = 0;
        for(int numbers : intNumbers){
            sum += numbers;

        }
        return sum/intNumbers.length;
    }

    //exercise 9
    public static int getFactorialOfNumber(int number){
    int factorial = 1;
    for (int counter = 0; counter < number; counter++){
    factorial *= counter;
        
    } return factorial;

    }





    }


    
    
