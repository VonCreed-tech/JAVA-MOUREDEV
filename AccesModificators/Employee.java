package AccesModificators;

public class Employee {
    private double salary;

    public Employee(double salary){
        this.salary = salary;
    }
    

    public void raiseSalary(double percent){
        if (percent <=0){
            System.out.println("not allowed negative values");

        }else{           
            this.salary = salary + (salary * (percent/100)) ;
            System.out.println("new salary is " + salary);
        }
    }
}