package com.patterns.factory.simple.pizza;

import com.patterns.factory.simple.PizzaFactory;

/**
 * Created by pep on 24/01/16.
 */
public class CheesePizza extends Pizza {
    public CheesePizza(){
        System.out.println(PizzaFactory.PizzaType.CHEESE_PIZZA);
    }
}
