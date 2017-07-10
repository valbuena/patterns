package com.patterns.iterator;

import java.util.Iterator;

public class ArrayToIterator implements Iterator<Object>{

    Object[] list;
    int position = 0;

    public ArrayToIterator(Object[] list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return (position < list.length && list[position] != null);
    }

    @Override
    public Object next() {
        Object element =  list[position];
        position++;
        return element;
    }
}
