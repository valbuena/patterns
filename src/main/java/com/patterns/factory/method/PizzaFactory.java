package com.patterns.factory.method;

import com.patterns.factory.method.pizzaStore.CHPizzaStore;
import com.patterns.factory.method.pizzaStore.NYPizzaStore;
import com.patterns.factory.method.pizzaStore.PizzaStore;

/**
 * Created by pep on 24/01/16.
 */
public class PizzaFactory {

    enum PizzaStoreType {NEW_YORK, CHICAGO};

    public PizzaStore createPizzaStore (PizzaStoreType pizzaStoreType)
    {
        PizzaStore pizzaStore = null;
        switch (pizzaStoreType){
            case NEW_YORK:
                pizzaStore = new NYPizzaStore();
                break;

            case CHICAGO:
                pizzaStore = new CHPizzaStore();
                break;
        }

        return pizzaStore;
    }
}
