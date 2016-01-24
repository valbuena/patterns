package com.patterns.factory.simple.pizza;

import com.patterns.factory.simple.PizzaFactory;

/**
 * Created by pep on 24/01/16.
 */
public class PepperoniPizza extends Pizza {
    public PepperoniPizza(){
        System.out.println(PizzaFactory.PizzaType.PEPPERONI_PIZZA);
    }
}
