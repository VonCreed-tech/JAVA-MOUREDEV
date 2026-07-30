package OOP;

public class Product{
    String productName;
    double price;
    
    public Product(String productName, double price){
        this.productName = productName;
        this.price = price;
    }

    public void getProductName(){
        System.out.println("The name of the product is " + this.productName);
    }

    public double getDiscount(){
        double result = this.price - (price * 0.25);
        System.out.println("With a 25% of discount, the total is " + result);
        return result;
    }


    
}