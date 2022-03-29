package patterns.factory;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //создаем фабрику
        PizzaFactory pizzaFactory = new PizzaFactory();
        //создаем пиццу выбранного типа
        Pizza tomatoPizza1 = pizzaFactory.createPizza(PizzaTypesEnum.TOMATO);
        Pizza tomatoPizza2 = pizzaFactory.createPizza(PizzaTypesEnum.TOMATO);
        Pizza cheesePizza1 = pizzaFactory.createPizza(PizzaTypesEnum.CHEESE);
        Pizza pepperoniPizza1 = pizzaFactory.createPizza(PizzaTypesEnum.PEPPERONI);
        //добавляем в список и вызываем метод
        List<Pizza> pizzas = Arrays.asList(tomatoPizza1, tomatoPizza2, cheesePizza1, pepperoniPizza1);
        pizzas.forEach(pizza -> pizza.cookPizza());
    }
}
