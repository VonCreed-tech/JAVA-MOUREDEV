package OOP;


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






    



    }
}
