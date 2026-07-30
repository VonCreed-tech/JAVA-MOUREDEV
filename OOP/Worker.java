package OOP;

public class Worker {
    String name;
    double salary;
    
    public Worker(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    public void getSalary(){
        System.out.println("Hola " + this.name + " " + "Tu salario es " + this.salary);
    }
    
}
