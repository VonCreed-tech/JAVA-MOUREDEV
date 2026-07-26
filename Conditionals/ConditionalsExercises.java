package Conditionals;

/*1. Establece la edad de un usuario y muestra si puede votar 
(mayor o igual a 18). 

2. Declara dos números y muestra cuál es mayor, o si son 
iguales. 

3. Dado un número, verifica si es positivo, negativo o cero. 

4. Crea un programa que diga si un número es par o impar. 

5. Verifica si un número está en el rango de 1 a 100. 

6. Declara una variable con el día de la semana (1-7) y muestra 
su nombre con switch. 

7. Simula un sistema de notas: muestra "Sobresaliente", 
"Aprobado" o "Suspenso" según la nota (0-100). 

8. Escribe un programa que determine si puedes entrar al cine: 
debes tener al menos 15 años o ir acompañado. 

9. Crea un programa que diga si una letra es vocal o consonante. 

10. Usa tres variables a, b, c y muestra cuál es el mayor de 
las tres. */

public class ConditionalsExercises {
    public static void main(String[] args){
        //exercise 1
        int userAge1 = 17;
        int userAge2 = 23;
        if (userAge1 >= 18){
            System.out.println("El usuario puede votar");
        }else{
            System.out.println("El usuario no puede votar");
        }

        if (userAge2 >= 18){
            System.out.println("El usuario puede votar");
        }else{
            System.out.println("El usuario no puede votar");
        }

        System.out.println("---------------------------------------");
        //exercise 2
        int numberFive = 5;
        int numberTwo = 2;

        if (numberFive > numberTwo){
            System.out.println(numberFive + " is greater than " + numberTwo);
        }else{
            System.out.println(numberTwo + " is greater than " + numberFive);
        }

        System.out.println("---------------------------------------");
         //exercise 3
        int number = -1;
        if (number > 0){
            System.out.println(number + " is a positive number");
        }else if (number < 0) {
            System.out.println(number + " is a negative number");
        } else {
            System.out.println(number + " is a equal to 0");
        }

        System.out.println("---------------------------------------");
        //exercise 4
        int oddOrEven = 5;
        if (oddOrEven%2 == 0){
            System.out.println("The number is even");
        }else{
            System.out.println("The number is odd");
        }

        System.out.println("---------------------------------------");
        //exercise 5
        int number1 = 20;
        if (number1 >=1 && number1<=100){
            System.out.println("The number " + number1 + " is in the range");
        }else{
            System.out.println("The number " + number1 + " is not inside the range");

        }

        System.out.println("---------------------------------------");
        //exercise 6
        int dayOfTheWeek = 5;
        switch (dayOfTheWeek) {
            case 1:
                System.out.println("We are on monday!");
                
                break;
            case 2:
                System.out.println("We are on tuesday!");
                
                break;
            case 3:
                System.out.println("We are on wednesday!");
                
                break;
            case 4:
                System.out.println("We are on thursday!");
                
                break;
            case 5:
                System.out.println("We are on friday!");
                
                break;
            case 6:
                System.out.println("We are on saturday!");
                
                break;
            case 7:
                System.out.println("We are on sunday!");           
                break;            
            default:
                System.out.println("The day is wrong somehow?");
                break;
        }

        System.out.println("---------------------------------------");
        //exercise 7
        int studentGrade = 60;
        int outstandingGrade = 80;
        int suspenseGrade = 40;

        if (studentGrade >= outstandingGrade){
            System.out.println("Outstanding!");
        }else if (studentGrade <= suspenseGrade){
            System.out.println("Suspense!");
        }else{
            System.out.println("Aproved!");
        }

        System.out.println("---------------------------------------");
        //exercise 8
        boolean hasCompany = true;
        int clientAge = 14;
        
        if (hasCompany == true && clientAge >= 15){
            System.out.println("The client can enter the cinema");
        }else{
            System.out.println("The client cannot enter the cinema");
        }

        System.out.println("---------------------------------------");
        //exercise 9
        char letter = 'e';

        if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' ){
            System.out.println("The letter "  + letter + " is a vowel");
        }else{
            System.out.println("The letter "  + letter + " is a consonant");
        }

        System.out.println("---------------------------------------");
        //exercise 10
        int a = 1;
        int b = 2;
        int c = 3;

        if (a > b && a>c){
            System.out.println("a is greater than b and c");
        }else if(b > a && b > c){
            System.out.println("a is greater than b and c");
        }else{
            System.out.println("c is greater than a and b");
        }


        



    }
}
