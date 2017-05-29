package com.patterns.factory.simple.pizzaStore;

import com.patterns.factory.simple.PizzaFactory;
import com.patterns.factory.simple.pizza.Pizza;

/**
 * Created by pep on 24/01/16.
 */
public class PizzaStore {

    PizzaFactory factory;

    public PizzaStore(PizzaFactory factory){
        this.factory = factory;
    }

    public Pizza orderPizza(PizzaFactory.PizzaType pizzaType){

        System.out.println("-----------------------");
        Pizza pizza = factory.createPizza(pizzaType);
        System.out.println("-----------------------");

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;

    }
}
