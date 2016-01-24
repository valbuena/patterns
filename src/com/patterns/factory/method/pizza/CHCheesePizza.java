package com.patterns.factory.method.pizza;

import com.patterns.factory.simple.pizza.CheesePizza;

import java.util.Collections;

/**
 * Created by pep on 24/01/16.
 */
public class CHCheesePizza extends PizzaFranchise {
    public CHCheesePizza(){
        setName("CHICAGO Cheese Pizza");
        setDough(Dough.EXTRA_THICK);
        setSauce(Sauce.PLUM_TOMATO);
        setToppings(Collections.singletonList(Topping.MOZZARELLA_CHEESE));
    }

}
