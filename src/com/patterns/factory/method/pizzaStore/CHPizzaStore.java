package com.patterns.factory.method.pizzaStore;

import com.patterns.factory.method.pizza.CHCheesePizza;
import com.patterns.factory.simple.PizzaFactory;
import com.patterns.factory.simple.pizza.Pizza;

/**
 * Created by pep on 24/01/16.
 */
public class CHPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(PizzaFactory.PizzaType pizzaType) {
        Pizza pizza = null;
        switch (pizzaType){
            case CHEESE_PIZZA:
                pizza = new CHCheesePizza();
                break;
        }

        return pizza;
    }
}
