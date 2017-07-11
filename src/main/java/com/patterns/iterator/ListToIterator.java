package com.patterns.iterator;


import java.util.Iterator;
import java.util.List;

public class ListToIterator implements Iterator<Object>{

    Iterator list;

    public ListToIterator(List list) {
        this.list = list.iterator();
    }

    @Override
    public boolean hasNext() {
        return list.hasNext();
    }

    @Override
    public Object next() {
        return list.next();
    }
}
