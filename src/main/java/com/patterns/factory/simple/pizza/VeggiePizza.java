package com.patterns.factory.simple.pizza;

import com.patterns.factory.simple.PizzaFactory;

/**
 * Created by pep on 24/01/16.
 */
public class VeggiePizza extends Pizza {
    public VeggiePizza(){
        System.out.println(PizzaFactory.PizzaType.VEGGIE_PIZZA);
    }
}
