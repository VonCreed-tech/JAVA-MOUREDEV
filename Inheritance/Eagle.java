package Inheritance;

public class Eagle extends Bird {
    @Override
    public void fly(){
        super.fly();
        System.out.println("I'm an eagle flying");
    }


}
