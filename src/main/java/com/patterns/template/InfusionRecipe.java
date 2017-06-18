package com.patterns.template;


public abstract class InfusionRecipe {

    public void prepareRecipe(){

        writeRecipe();

        boilWater();

        brew();

        pourIncup();

        addCondiments();
    };

    protected abstract void writeRecipe();

    protected void boilWater(){
        System.out.println("STEP: Boil water");
    };

    protected void pourIncup(){
        System.out.println("STEP: Pouring into cup");
    }

    protected abstract void brew();

    protected abstract void addCondiments();


}
