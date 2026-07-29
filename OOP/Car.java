package OOP;

public class Car {

    String brand;
    String model;

    public Car(String brand, String model){
        this.brand = brand;
        this.model = model; 
    }

    public void showData(){
        System.out.println("The brand of the car is  " + "" + brand + " and the model is " + "" + model);
    }
    
}
