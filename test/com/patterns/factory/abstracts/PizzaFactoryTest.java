package com.patterns.factory.abstracts;


import com.patterns.factory.abstracts.PizzaFactory;
import com.patterns.factory.abstracts.pizzaStore.PizzaStore;
import org.junit.Test;

/**
 * Created by pep on 24/01/16.
 */
public class PizzaFactoryTest {

    @Test
    public void testPizzaFactory(){

        PizzaFactory factory = new PizzaFactory();
        PizzaStore store = factory.createPizzaStore(PizzaFactory.PizzaStoreType.NEW_YORK);
        store.orderPizza();

        store = factory.createPizzaStore(PizzaFactory.PizzaStoreType.CHICAGO);
        store.orderPizza();

    }
}
