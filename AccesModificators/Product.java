package AccesModificators;

public class Product {

    private double price;

    public Product(double price){
        this.price = price;
    }

    public double getPrice(){
        return this.price;
    }

    public double setPrice(double price){
        if (price >= 0){
            this.price = price;
            return price;
        }

        return price;
        
    }

    
}
