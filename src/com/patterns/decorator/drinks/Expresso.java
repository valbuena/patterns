package com.patterns.decorator.drinks;

import com.patterns.decorator.Order;
import com.patterns.decorator.OrderDecorator;

/**
 * Created by pep on 6/01/16.
 */
public class Expresso extends OrderDecorator {

    public Expresso(final Order beverage){
        super(beverage);
    }

    @Override
    public String getDescription() {
        return getOrder().getDescription() + "\n Expresso";
    }

    @Override
    public double cost() {
        return getOrder().cost() +  1.99;
    }
}
