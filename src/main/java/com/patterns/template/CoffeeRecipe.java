package com.patterns.template;

public class CoffeeRecipe extends InfusionRecipe{

    @Override
    protected void writeRecipe() {
        System.out.println("RECIPE: Making coffee recipe");
    }

    @Override
    protected void brew() {
        System.out.println("STEP: Dripping coffe through filter");
    }

    @Override
    protected void addCondiments() {
        System.out.println("STEP: Adding sugar and milk");
    }
}
