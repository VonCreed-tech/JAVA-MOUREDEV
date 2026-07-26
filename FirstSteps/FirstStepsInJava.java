package FirstSteps;
// 1. Imprime un mensaje que diga tu nombre en lugar de "¡Hola
// Mundo!". DONE 

// 2. Imprime dos líneas: "Hola" y luego "Mundo" con un solo
// println. DONE

// 3. Añade un comentario sobre lo que hace cada línea del
// programa. DONE

// 4. Crea un comentario en varias líneas. DONE

// 5. Imprime tu edad, tu color favorito y tu ciudad. DONE 

// 6. Explora los diferentes System.XXX.println(); más allá de
// "out". DONE 

// 7. Utiliza varios println para imprimir una frase. DONE

// // 8. Imprime un diseño ASCII (por ejemplo, una cara feliz usando
// símbolos).DONE

// 9. Intenta ejecutar el programa sin el método main y observa el
// error. DONE

// 10.
// Intenta cambiar el nombre del archivo a uno diferente
// del de la clase y compílalo. ¿Qué pasa? DONE

//It ask to you to change the class inside the code.

//declaring a class
public class FirstStepsInJava {
    //declaring the main function
    public static void main(String[] args){
        //printing an standard output
        System.out.println("Hello I'm Ignacio");
        System.out.println("Hello \nWorld");
        /*
        This is a multiple line
        comment
        Enjoy the process
        */

        System.out.println("My age is 23, My favorite color is orange, My city is Rancagua");
        
        //exploring al types of system

        //printing the current time in miliseconds
        System.out.println(System.currentTimeMillis());

        // nanotime() Returns the current value of the most precise available system timer, in nanoseconds
        System.out.println(System.nanoTime());

        //Suggests that the Java Virtual Machine run the garbage collector
        System.gc();

        //Sets the system property indicated by the key
        System.setProperty("myName", "Ignacio");
        System.setProperty("myAge", "23");

        //Gets the system property indicated by the key, or returns the default value if not found
        System.out.println(System.getProperty("myName"));

        //Returns all system properties as a Properties object
        // System.out.println(System.getProperties());

        // Removes the system property indicated by the key
        System.clearProperty("myName");
        System.out.println(System.getProperty("myName"));

        //Copies elements from the source array into the destination array
        //arraycopy()

        //Returns the default hash code of the given object (even if hashCode() is overridden)
        //identityHashCode()

        //Returns the system-dependent line separator string (e.g., "\n" on Linux, "\r\n" on Windows)
        //lineSeparator()

        // Returns an unmodifiable map of the system environment variables
        // getenv()

        // Returns the value of the specified environment variable, or null if it does not exist
        // getenv()

        // Standard input stream (usually the keyboard)
        // in

        // Standard output stream (usually the console). Often used with println()
        // out

        // Standard error output stream (usually the console)
        // err


        System.out.print("Using varios prints ");
        System.out.print("to print a phrase, ");
        System.out.println("done.");


        //ASCII HAPPY FACE
        System.out.println("||         ||");
        System.out.println("||         ||");
        System.out.println("||         ||");
        System.out.println("             ");
        System.out.println("||         ||");
        System.out.println(" |         |");
        System.out.println("  |       |");
        System.out.println("   | ____|");

        
        

        //	Terminates the running Java program. A nonzero status indicates abnormal termination
        System.exit(0);

    }

    
}