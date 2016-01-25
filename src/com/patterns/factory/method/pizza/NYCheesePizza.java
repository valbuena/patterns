package com.patterns.factory.method.pizza;

import java.util.Collections;

/**
 * Created by pep on 24/01/16.
 */
public class NYCheesePizza extends Pizza {

    public NYCheesePizza(){
        setName("NEW YORK Cheese Pizza");
        setDough(Dough.THIN);
        setSauce(Sauce.MARINARA);
        setToppings(Collections.singletonList(Topping.REGGIANO_CHEESE));
    }
}
