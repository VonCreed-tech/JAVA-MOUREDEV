package OOP;

import java.util.ArrayList;

public class ClassesExercises {
    public static void main(String[] args){
    //Exercise one - three (I did both unintentionally)
    Book theLittlePrinceBook = new Book("The Little Prince", "Antoine De Saint-Exupéry");
    theLittlePrinceBook.showInformation();
    System.out.println("----------------------------------");
    //Exercise two
    Dog georgeTheDog = new Dog();
    georgeTheDog.bark();
    System.out.println("----------------------------------");
    //Exercise four
    Car client1Car = new Car("Susuki","Swift");
    client1Car.showData();
    System.out.println("----------------------------------");

    //Exercise five
    Student student1 = new Student(60);
    student1.getApproved();
    System.out.println("----------------------------------");

    //Exercise six 
    BankAccount myAccount = new BankAccount(100000);
    myAccount.deposit(500000);
    System.out.println("----------------------------------");
    myAccount.getBalance();
    System.out.println("----------------------------------");


    //Exercise seven
    Rectangle myRectangle = new Rectangle(2, 4);
    myRectangle.getArea();
    myRectangle.getPerimeter();

    //Exercise eight
    Worker worker1 = new Worker("Ignacio", 4500000);
    worker1.getSalary();

    //Exercise nine
    Person person1 = new Person("Ignacio", 23);
    Person person2 = new Person("David", 23);
    Person person3 = new Person("Diego", 23);

    ArrayList<Person> listOfPersons = new ArrayList<>();
    listOfPersons.add(person1);
    listOfPersons.add(person2);
    listOfPersons.add(person3);
    
    System.out.println(listOfPersons);
    System.out.println("----------------------------------");



    //Exercise ten
    Product product1 = new Product("Tomato", 500);
    product1.getProductName();
    System.out.println("----------------------------------");

    product1.getDiscount();


    }
}
