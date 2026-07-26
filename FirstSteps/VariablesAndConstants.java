package FirstSteps;
// 1. Declara una variable de tipo String y asígnale tu nombre. DONE
// 2. Crea una variable de tipo int y asígnale tu edad. DONE
// 3. Crea una variable double con tu altura en metros. DONE
// 4. Declara una variable de tipo boolean que indique si te gusta 
// programar. DONE
// 5. Declara una constante con tu email. DONE
// 6. Crea una variable de tipo char y guárdale tu inicial. DONE
// 7. Declara una variable de tipo String con tu localidad, y a
// continuación cambia su valor y vuelve a imprimirla. DONE
// 8. Crea una variable int llamada a, otra b, e imprime la suma de
// ambas. DONE
// 9. Imprime el tipo de dos variables creadas anteriormente. DONE
// 10. Intenta declarar una variable sin inicializarla y luego
// asígnale un valor antes de imprimirla. DONE

public class VariablesAndConstants{
    public static void main(String[] args){

        String name = "Ignacio";
        int age = 23;
        double height = 1.68;
        boolean likeToProgram = true;
        final String email = "ing.ignaciomadriaga@gmail.com";
        char initialName= 'I';
        String location = "Rancagua";
        location = "Machali";
        System.out.println(location);
        int a = 1;
        int b = 1;
        int sumAB = a+b;
        System.out.println("The sum of a + b is " + sumAB);

        System.out.println("My name is " + name);
        System.out.println("My name starts with " + initialName);

        int num;
        num = 20;
        System.out.print("Printing a number ");

    }
}