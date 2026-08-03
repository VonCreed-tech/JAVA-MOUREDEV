package AccesModificators;

public class Temperature {
    private double celsius;

    public Temperature(double celsius){
        this.celsius = celsius;
    }

    public void setCelsius(double celsius) {
        if (celsius >= -100 && celsius<=100){
            this.celsius = celsius;
        }
    }

    public double getCelsius() {
        System.out.println(celsius);
        return celsius;
    }
    
}
