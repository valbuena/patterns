package com.patterns.factory.simple.pizza;

import com.patterns.factory.simple.PizzaFactory;

/**
 * Created by pep on 24/01/16.
 */
public class ClamPizza extends Pizza {
    public ClamPizza(){
        System.out.println(PizzaFactory.PizzaType.CLAM_PIZZA);
    }
}
