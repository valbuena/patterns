package com.patterns.composite;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Menu extends MenuComponent{

    private List<MenuComponent> menuComponents = new ArrayList<MenuComponent>();

    public Menu(String name, String description) {
        super(name, description);
    }

    @Override
    public void add(MenuComponent menuComponent) {
        this.menuComponents.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        this.menuComponents.remove(menuComponent);
    }

    @Override
    public Optional<MenuComponent> getChild(int i) {
        Optional menuComponent = Optional.empty();
        if (i < menuComponents.size())
            menuComponent = Optional.of(this.menuComponents.get(i));
        return menuComponent;
    }

    @Override
    public void print() {
        System.out.println("----" + getName().toUpperCase() + "--------");
        System.out.println(getDescription());
        this.menuComponents.stream().forEach(MenuComponent::print);
    }
}
