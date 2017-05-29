package com.patterns.decorator.condiments;

import com.patterns.decorator.OrderDecorator;
import com.patterns.decorator.Order;

/**
 * Created by pep on 6/01/16.
 */
public class Milk extends OrderDecorator {


    public Milk(final Order beverage){
        super(beverage);
    }

    @Override
    public String getDescription() {
        return getOrder().getDescription() + " + Milk ";
    }

    @Override
    public double cost() {
        return getOrder().cost() + 0.50;
    }
}
