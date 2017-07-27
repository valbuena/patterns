package com.patterns.proxy.protection;

public interface Hotel {

    String getName();
    int getRating();
    void setPoints(int points) throws IllegalAccessException;
    void setName(String name)throws IllegalAccessException;
}
