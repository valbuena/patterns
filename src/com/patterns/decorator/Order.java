package com.patterns.decorator;

/**
 * Created by pep on 6/01/16.
 */
public abstract class Order {


    public abstract String getDescription();

    public abstract double cost();


    public void print () {
        System.out.println("------------");
        System.out.format("Order: %s \n TOTAL $: %.2f \n", this.getDescription(), this.cost());
        System.out.println("------------");
    }
}
