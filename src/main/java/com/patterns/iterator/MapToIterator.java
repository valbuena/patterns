package com.patterns.iterator;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapToIterator implements Iterator<Object>{

    Iterator map;

    public MapToIterator(Map map) {
        this.map = map.values().iterator();
    }

    @Override
    public boolean hasNext() {
        return map.hasNext();
    }

    @Override
    public Object next() {
        return map.next();
    }
}
