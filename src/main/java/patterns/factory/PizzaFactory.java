package patterns.factory;

public class PizzaFactory {
    public Pizza createPizza (PizzaTypesEnum pizzaType) {
        switch (pizzaType) {
            case CHEESE: return new CheesePizza();
            case TOMATO: return new TomatoPizza();
            case PEPPERONI:return new PepperoniPizza();
            default: return null;
        }
    }
}
