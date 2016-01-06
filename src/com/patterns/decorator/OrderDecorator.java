package com.patterns.decorator;

/**
 * Created by pep on 6/01/16.
 */
public abstract class OrderDecorator extends Order {
    private Order order;

    public OrderDecorator(Order beverage){
        setOrder(beverage);
    }

    public Order getOrder() {
        return order;
    }

    protected void setOrder(Order order) {
        this.order = order;
    }


}
