package com.patterns.factory.abstracts.ingredients;

import java.util.List;

/**
 * Created by pep on 25/01/16.
 */
public interface PizzaIngredient {

    enum Dough {THIN, CRUST, EXTRA_THICK};
    enum Sauce {MARINARA, PLUM_TOMATO, BARBECUE};
    enum Cheese {REGGIANO, MOZZARELLA,CHEDDAR};
    enum Veggie {GARLIC, ONION, MUSHROOM, REDPEPPER}

    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    List<Veggie> createVeggie();
}
