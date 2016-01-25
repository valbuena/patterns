package com.patterns.factory.abstracts.pizzaStore;

import com.patterns.factory.abstracts.ingredients.NYPizzaIngredient;
import com.patterns.factory.abstracts.ingredients.PizzaIngredient;
import com.patterns.factory.abstracts.pizza.NYPizza;
import com.patterns.factory.abstracts.pizza.Pizza;



/**
 * Created by pep on 24/01/16.
 */
public class NYPizzaStore extends PizzaStore {


    @Override
    public Pizza createPizza() {
        PizzaIngredient ingredients = new NYPizzaIngredient();
        Pizza pizza  = new NYPizza(ingredients);
        return pizza;
    }
}
