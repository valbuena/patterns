package com.patterns.factory.simple;


import org.junit.Test;

/**
 * Created by pep on 24/01/16.
 */
public class PizzaFactoryTest {

    @Test
    public void testPizzaFactory(){
        PizzaFactory factory = new PizzaFactory();
        PizzaStore store = new PizzaStore(factory);

        store.orderPizza(PizzaFactory.PizzaType.CHEESE_PIZZA);

        store.orderPizza(PizzaFactory.PizzaType.CLAM_PIZZA);

        store.orderPizza(PizzaFactory.PizzaType.PEPPERONI_PIZZA);

        store.orderPizza(PizzaFactory.PizzaType.VEGGIE_PIZZA);

    }
}
