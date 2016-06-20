package com.patterns.factory.abstracts.ingredients;

import java.util.Arrays;
import java.util.List;

/**
 * Created by pep on 25/01/16.
 */
public class NYPizzaIngredient implements PizzaIngredient {

    @Override
    public Dough createDough() {
        return Dough.CRUST;
    }

    @Override
    public Sauce createSauce() {
        return Sauce.MARINARA;
    }

    @Override
    public Cheese createCheese() {
        return Cheese.REGGIANO;
    }

    @Override
    public List<Veggie> createVeggie() {
        return Arrays.asList(new Veggie[] {Veggie.GARLIC, Veggie.MUSHROOM});
    }


}
