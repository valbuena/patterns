package com.patterns.factory.abstracts.ingredients;

import java.util.Arrays;
import java.util.List;

/**
 * Created by pep on 25/01/16.
 */
public class CHPizzaIngredient implements PizzaIngredient {

    @Override
    public Dough createDough() {
        return Dough.THIN;
    }

    @Override
    public Sauce createSauce() {
        return Sauce.BARBECUE;
    }

    @Override
    public Cheese createCheese() {
        return Cheese.MOZZARELLA;
    }

    @Override
    public List<Veggie> createVeggie() {
        return Arrays.asList(new Veggie[] {Veggie.ONION, Veggie.REDPEPPER});
    }


}
