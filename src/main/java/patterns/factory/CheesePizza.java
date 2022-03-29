package patterns.factory;

public class CheesePizza implements Pizza {
    @Override
    public void cookPizza() {
        System.out.println("Make pizza with cheese");
    }
}
