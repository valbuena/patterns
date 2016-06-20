package com.patterns.factory.abstracts.pizzaStore;

import com.patterns.factory.abstracts.ingredients.CHPizzaIngredient;
import com.patterns.factory.abstracts.ingredients.PizzaIngredient;
import com.patterns.factory.abstracts.pizza.CHPizza;
import com.patterns.factory.abstracts.pizza.Pizza;


/**
 * Created by pep on 24/01/16.
 */
public class CHPizzaStore extends PizzaStore {

    @Override
    public com.patterns.factory.abstracts.pizza.Pizza createPizza() {
        PizzaIngredient ingredients = new CHPizzaIngredient();
        Pizza pizza  = new CHPizza(ingredients);
        return pizza;
    }
}
