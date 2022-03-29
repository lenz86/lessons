package patterns.factory;

public class PepperoniPizza implements Pizza {
    @Override
    public void cookPizza() {
        System.out.println("Make pizza with pepperoni");
    }
}
