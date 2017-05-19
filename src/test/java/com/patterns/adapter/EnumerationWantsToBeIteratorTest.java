package com.patterns.adapter;

import org.junit.Test;

import java.util.*;

/**
 * Created by evalb on 20/05/17.
 */
public class EnumerationWantsToBeIteratorTest {

    @Test
    public void testEnumerationLikeIterator(){

        Vector<String> vector = new Vector (Arrays.asList(new String[]{"hello", "wonderful","world", "!"}));


        Iterator iterator = new EnumerationWantsToBeIterator(vector.elements());


        iterator.forEachRemaining(element -> System.out.println(element));

    }
}
