package com.patterns.template;

import org.junit.Test;

public class InfusionRecipeTest {

    @Test
    public void testCoffeeRecipe(){
        CoffeeRecipe coffeeRecipe = new CoffeeRecipe();
        coffeeRecipe.prepareRecipe();
    }

    @Test
    public void testTeaRecipe(){
        TeaRecipe teaRecipe = new TeaRecipe();
        teaRecipe.prepareRecipe();
    }
}
