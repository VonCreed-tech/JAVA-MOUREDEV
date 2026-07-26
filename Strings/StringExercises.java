package Strings;

/*  Strings  
    1. Concatena dos cadenas de texto. 
    
    2. Muestra la longitud de una cadena de texto. 
    
    3. Muestra el primer y último carácter de un string. 
    
    4. Convierte a mayúsculas y minúsculas un string. 
    
    5. Comprueba si una cadena de texto contiene una palabra 
    concreta. 
    
    6. Formatea un string con un entero. 
    
    7. Elimina los espacios en blanco al principio y final de un 
    string. 
    
    8. Sustituye todos los espacios en blanco de un string por un 
    guión (-). 
    
    9. Comprueba si dos strings son iguales. 
    
    10. Comprueba si dos strings tienen la misma longitud. */ 

public class StringExercises{
    public static void main(String[] args){
    
    

    System.out.println("concatenation of two Strings");
    String greeting = "Hello,";
    String askCondition = "how are you ?";
    System.out.println("(greeting + \" \" + askCondition)");
    System.out.println(greeting + " " + askCondition);

    System.out.println("----------------------------------------");

    System.out.println("length of a text string");
    System.out.println("greeting.length(): " + (greeting.length()));

    System.out.println("----------------------------------------");

    System.out.println("First and last character of a string");
    System.out.println("First of Hello: " + greeting.charAt(0) );
    System.out.println("Last of Hello: " + greeting.charAt(4) );
        
    System.out.println("----------------------------------------");

    System.out.println("Converting a String to uppercase and lowercase");
    System.out.println("Hello to uppercase: " + greeting.toUpperCase());
    System.out.println("Hello to lowercase: " + greeting.toLowerCase());

    System.out.println("----------------------------------------");
    System.out.println("Verifyng if a word contais an specific word");
    System.out.println("greeting.contains(ello): " + greeting.contains("ello"));

    System.out.println("----------------------------------------");
    System.out.println("Formatting an String with an inter");
    String name = "Ignacio";
    int age = 23;
    // String myStr = "I'm %s and I have %d experiencie in java!";
    // String formatedStr = String.format(myStr, "Ignacio", 0);
    // System.out.println(formatedStr);

    System.out.println(String.format("Hello, my name is %s, and I have %d years!.", name, age));

    System.out.println("----------------------------------------");
    System.out.println("Eliminating blank spaces in a text String");
    String sentence = " Java is awesome ";
    System.out.println("sentence.trim(): " + sentence.trim());

    System.out.println("----------------------------------------");
    System.out.println("Replace blank spaces with - character");
    String word = " Jump ";
    System.out.println(word.replace(" ", "-"));

    System.out.println("----------------------------------------");
    System.out.println("Checking if two strings are equal");
    System.out.println("is Hello equals to Jump ? : " + greeting.equals(word));

    System.out.println("----------------------------------------");
    String helloWord="Hello";
    System.out.println("Checking if two strings have the same length");
    System.out.println("Hello have the same length like Jump ? : " + (greeting.length() == helloWord.length()));


    }
}