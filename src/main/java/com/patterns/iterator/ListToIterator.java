package com.patterns.iterator;


import java.util.Iterator;
import java.util.List;

public class ListToIterator implements Iterator<Object>{

    List<Object> list;
    int position = 0;

    public ListToIterator(List list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return (position < list.size() && list.get(position) != null);
    }

    @Override
    public Object next() {
        Object element = list.get(position);
        position++;
        return element;
    }
}
