package com.patterns.factory.abstracts.pizzaStore;

import com.patterns.factory.abstracts.pizza.Pizza;



/**
 * Created by pep on 24/01/16.
 */
public abstract class PizzaStore {


    public abstract Pizza createPizza ();

    public Pizza orderPizza(){

        System.out.println("-----------------------");
        Pizza pizza = createPizza();
        pizza.prepareIngredients();
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;

    }
}
