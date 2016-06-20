package com.patterns.factory.method;


import com.patterns.factory.method.pizzaStore.PizzaStore;
import org.junit.Test;

/**
 * Created by pep on 24/01/16.
 */
public class PizzaFactoryTest {

    @Test
    public void testPizzaFactory(){

        PizzaFactory factory = new PizzaFactory();
        PizzaStore store = factory.createPizzaStore(PizzaFactory.PizzaStoreType.NEW_YORK);
        store.orderPizza(com.patterns.factory.simple.PizzaFactory.PizzaType.CHEESE_PIZZA);

        store = factory.createPizzaStore(PizzaFactory.PizzaStoreType.CHICAGO);
        store.orderPizza(com.patterns.factory.simple.PizzaFactory.PizzaType.CHEESE_PIZZA);

    }
}
