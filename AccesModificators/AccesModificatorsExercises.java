package AccesModificators;

public class AccesModificatorsExercises {

    public static void main(String[] args){

        //Exercises 1
        Person personInformation = new Person("Ignacio", 23);    
        System.out.println(personInformation.getName());
        personInformation.setName("Jeremy");
        System.out.println(personInformation.getName());
        System.out.println(personInformation.getAge());
        personInformation.setAge(25);
        System.out.println(personInformation.getAge());

        //Exercises 2 
        Product orange = new Product(29.99);
        System.out.println(orange.getPrice());
        orange.setPrice(25.99);
        System.out.println(orange.getPrice());

        //Exercises 3
        BankAccount myAccount = new BankAccount(100000);

        myAccount.deposit(20000);
        myAccount.withdraw(20000);
        
        //Exercise 4

        Book myBook = new Book("Spirit");
        myBook.setTitle("Spirit Horse");
        myBook.getTitle();

        //Exercise 5
        Temperature chileTemperature = new Temperature(38);

        chileTemperature.getCelsius();
        chileTemperature.setCelsius(20);
        chileTemperature.getCelsius();

        //Exercise 6
        User myUser = new User("Ignacio", "");
        myUser.setPassword("1234");
        myUser.checkPassword("1234");

        //Exercise 7
        Employee myEmployee = new Employee(500000);
        myEmployee.raiseSalary(20);
        myEmployee.raiseSalary(-1);



    }

    
}
