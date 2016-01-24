package com.patterns.factory.method.pizza;

import com.patterns.factory.simple.pizza.Pizza;

import java.util.List;

/**
 * Created by pep on 24/01/16.
 */
public class PizzaFranchise extends Pizza {

    enum Dough {THIN, CRUST, EXTRA_THICK};
    enum Sauce {MARINARA, PLUM_TOMATO};
    enum Topping {REGGIANO_CHEESE, MOZZARELLA_CHEESE};


    String name;
    Dough dough;
    Sauce sauce;
    List<Topping> toppings;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dough getDough() {
        return dough;
    }

    public void setDough(Dough dough) {
        this.dough = dough;
    }

    public Sauce getSauce() {
        return sauce;
    }

    public void setSauce(Sauce sauce) {
        this.sauce = sauce;
    }

    public List<Topping> getToppings() {
        return toppings;
    }

    public void setToppings(List<Topping> toppings) {
        this.toppings = toppings;
    }


    public void prepare(){
        System.out.println("Preparing ..." + getName());
        System.out.print("-> toppings : " );
        getToppings().forEach(x -> System.out.print(x));
        System.out.println();
        System.out.println("-> dough : " + getDough());
        System.out.println("-> sauce : " + getSauce());


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
