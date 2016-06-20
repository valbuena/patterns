package com.patterns.factory.simple;

import com.patterns.factory.simple.pizza.*;

/**
 * Created by pep on 24/01/16.
 */
public class PizzaFactory {

    public enum PizzaType {CHEESE_PIZZA, CLAM_PIZZA, PEPPERONI_PIZZA, VEGGIE_PIZZA};

    public Pizza createPizza (PizzaType pizzaType)
    {
        Pizza pizza = null;
        switch (pizzaType){
            case CHEESE_PIZZA:
                pizza = new CheesePizza();
                break;

            case CLAM_PIZZA:
                pizza = new ClamPizza();
                break;
            case PEPPERONI_PIZZA:
                pizza = new PepperoniPizza();
                break;

            case VEGGIE_PIZZA:
                pizza = new VeggiePizza();
                break;
        }

        return pizza;
    }




}
