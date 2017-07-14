package com.patterns.composite;


import java.util.Optional;

public abstract class MenuComponent {

    private String name;
    private String description;

    public MenuComponent(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public abstract void add (MenuComponent menuComponent);

    public abstract void remove (MenuComponent menuComponent);

    public abstract Optional<MenuComponent> getChild(int i);

    public abstract void print();
}
