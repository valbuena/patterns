package com.patterns.factory.abstracts.pizza;

import com.patterns.factory.abstracts.ingredients.PizzaIngredient;
import com.patterns.factory.abstracts.pizza.Pizza;

import java.util.Collections;

/**
 * Created by pep on 24/01/16.
 */
public class CHPizza extends Pizza {

    PizzaIngredient ingredients;

    public CHPizza(PizzaIngredient ingredients) {
        this.ingredients = ingredients;

    }

    public void prepareIngredients()
    {
        setName("CHICAGO Pizza");
        setDough(ingredients.createDough());
        setSauce(ingredients.createSauce());
        setCheese(ingredients.createCheese());
    }


}
