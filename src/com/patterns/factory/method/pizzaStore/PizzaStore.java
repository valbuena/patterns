package com.patterns.factory.method.pizzaStore;

import com.patterns.factory.simple.PizzaFactory;
import com.patterns.factory.simple.pizza.Pizza;

/**
 * Created by pep on 24/01/16.
 */
public abstract class PizzaStore {


    public abstract Pizza createPizza (PizzaFactory.PizzaType pizzaType);

    public Pizza orderPizza(PizzaFactory.PizzaType pizzaType){

        System.out.println("-----------------------");
        Pizza pizza = createPizza(pizzaType);
        System.out.println("-----------------------");

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;

    }
}
