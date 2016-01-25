package com.patterns.factory.method.pizzaStore;

import com.patterns.factory.method.pizza.Pizza;
import com.patterns.factory.simple.PizzaFactory;


/**
 * Created by pep on 24/01/16.
 */
public abstract class PizzaStore {


    public abstract Pizza createPizza (PizzaFactory.PizzaType pizzaType);

    public Pizza orderPizza(PizzaFactory.PizzaType pizzaType){

        System.out.println("-----------------------");
        Pizza pizza = createPizza(pizzaType);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;

    }
}
