package AccesModificators;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public String setName(String name){
        this.name = name;
        return name;
    }

    public int getAge(){
        return this.age;
    }

    public int setAge(int age){
        this.age = age;
        return age;
    }
    
    
}
