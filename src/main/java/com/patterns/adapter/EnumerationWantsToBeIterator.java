package com.patterns.adapter;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Created by evalb on 20/05/17.
 */
public class EnumerationWantsToBeIterator implements Iterator<Object> {

    Enumeration<?> enumeration;

    public EnumerationWantsToBeIterator(Enumeration<?> enumeration) {
        this.enumeration = enumeration;
    }

    @Override
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    @Override
    public Object next() {
        return enumeration.nextElement();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void forEachRemaining(Consumer<? super Object> consumer) {
        Objects.requireNonNull(consumer);

        while(enumeration.hasMoreElements()) {
            consumer.accept(enumeration.nextElement());
        }
    }
}
