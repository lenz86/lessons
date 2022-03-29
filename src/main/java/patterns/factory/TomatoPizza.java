package patterns.factory;

public class TomatoPizza implements Pizza {
    @Override
    public void cookPizza() {
        System.out.println("Make pizza with tomatoes");
    }
}
