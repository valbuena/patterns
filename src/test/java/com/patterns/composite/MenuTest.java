package com.patterns.composite;


import org.junit.Test;

public class MenuTest {

    @Test
    public void testPrintMenu(){
        MenuComponent menu = createMenu();
        menu.print();
    }


    private MenuComponent createMenu(){

        MenuComponent menu = new Menu("Valbuena Menu", "Mediterranean Food");

        MenuComponent breakfastMenu = new Menu("Breakfast Menu", "You need this to get up with energy");
        breakfastMenu.add(new MenuItem("Java Tea", "Delicious big black tea"));
        breakfastMenu.add(new MenuItem("Java Coffee", "A big mug of coffe from Indonesia"));
        breakfastMenu.add(new MenuItem("Toast with jam", "Different flavours : strawberry, pear, apple and so on"));

        MenuComponent dessertMenu = new Menu("Dessert Menu", "Sweet Sweet!!!");
        dessertMenu.add(new MenuItem("Cheese cake", "Nothing else to say"));
        dessertMenu.add(new MenuItem("Watermelon", "Healthy option ;-)"));

        MenuComponent lunchMenu = new Menu("Lunch Menu", "Healthy food for lunch");
        lunchMenu.add(new MenuItem("Fresh salad", "A big big salad"));
        lunchMenu.add(new MenuItem("Light Chicken", "Roasted chicken without oil"));
        lunchMenu.add(dessertMenu);

        MenuComponent dinnerMenu = new Menu("Dinner Menu", "Special dinner menu for you");
        dinnerMenu.add(new MenuItem("Bean soap", "When the winter is coming"));
        dinnerMenu.add(new MenuItem("Hake with salad", "Healthy and delicious option"));
        dinnerMenu.add(dessertMenu);

       menu.add(breakfastMenu);
       menu.add(lunchMenu);
       menu.add(dinnerMenu);

       return menu;

    }
}
