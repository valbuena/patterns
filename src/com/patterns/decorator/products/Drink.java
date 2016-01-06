package com.patterns.decorator.products;

import com.patterns.decorator.Order;

/**
 * Created by pep on 6/01/16.
 */
public class Drink extends Order {

    @Override
    public String getDescription() {
        return "Drinks : ";
    }

    @Override
    public double cost() {
        return 0;
    }
}
