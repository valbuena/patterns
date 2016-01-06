package com.patterns.decorator.condiments;

import com.patterns.decorator.OrderDecorator;
import com.patterns.decorator.Order;

/**
 * Created by pep on 6/01/16.
 */
public class Sugar extends OrderDecorator {

    public Sugar (final Order beverage){
        super(beverage);
    }

    @Override
    public String getDescription() {
        return getOrder().getDescription() + " + Sugar ";
    }

    @Override
    public double cost() {
        return getOrder().cost() + 0.20;
    }
}
