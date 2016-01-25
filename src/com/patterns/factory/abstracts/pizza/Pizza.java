package com.patterns.factory.abstracts.pizza;

import com.patterns.factory.abstracts.ingredients.PizzaIngredient;

import java.util.List;

/**
 * Created by pep on 24/01/16.
 */
public abstract class Pizza {

    String name;
    PizzaIngredient.Dough dough;
    PizzaIngredient.Sauce sauce;
    PizzaIngredient.Cheese cheese;
    List<PizzaIngredient.Veggie> veggies;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PizzaIngredient.Dough getDough() {
        return dough;
    }

    public void setDough(PizzaIngredient.Dough dough) {
        this.dough = dough;
    }

    public PizzaIngredient.Sauce getSauce() {
        return sauce;
    }

    public void setSauce(PizzaIngredient.Sauce sauce) {
        this.sauce = sauce;
    }

    public PizzaIngredient.Cheese getCheese() {
        return cheese;
    }

    public void setCheese(PizzaIngredient.Cheese cheese) {
        this.cheese = cheese;
    }

    public List<PizzaIngredient.Veggie> getVeggies() {
        return veggies;
    }

    public void setVeggies(List<PizzaIngredient.Veggie> veggies) {
        this.veggies = veggies;
    }

    public abstract void prepareIngredients();

    public void prepare(){
        System.out.println("Preparing ..." + getName());
        System.out.println("-> dough : " + getDough());
        System.out.println("-> sauce : " + getSauce());
        System.out.println("-> cheese : " + getCheese());


    };

    public void bake(){
        System.out.println("Baking ...");
    }

    public void cut(){
        System.out.println("Cutting ...");
    }

    public void box(){
        System.out.println("Boxing ...");
    }
}
