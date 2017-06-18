package com.patterns.template;

public class TeaRecipe extends InfusionRecipe {

    @Override
    protected void writeRecipe() {
        System.out.println("RECIPE: Making tea recipe");
    }
    @Override
    protected void brew() {
        System.out.println("STEP: Steeping the tea");
    }

    @Override
    protected void addCondiments() {
        System.out.println("STEP: Adding Lemon");
    }
}
