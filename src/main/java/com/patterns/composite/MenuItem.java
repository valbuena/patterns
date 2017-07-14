package com.patterns.composite;

import java.util.Optional;

public class MenuItem extends MenuComponent{


    public MenuItem(String name, String description) {
        super(name, description);
    }

    @Override
    public void add(MenuComponent menuComponent) {
        System.out.println("I can't add anything I am a leaf");
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        System.out.println("I can't remove anything I am a leaf");
    }

    @Override
    public Optional<MenuComponent> getChild(int i) {
        return Optional.empty();
    }

    @Override
    public void print() {
        System.out.println("*" + getName().toUpperCase() + " : " + getDescription());
    }
}
