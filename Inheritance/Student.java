package Inheritance;

public class Student extends Person {
    double grade;
    public Student(String name, int age, double grade){
        super(name, age);
        this.grade = grade;
    }

    public void study(){
        System.out.println("Estudying");
    }
    
}
