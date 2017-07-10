package com.patterns.iterator;


import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class IteratorTest {

    @Test
    public void testArrayToIterator (){
        String [] list = {"Array", "To", "Iterator"};
        ArrayToIterator arrayToIterator = new ArrayToIterator(list);
        while(arrayToIterator.hasNext()){
            System.out.println(arrayToIterator.next());
        }
    }

    @Test
    public void testListToIterator (){
        List<String> list = Arrays.asList("List", "To", "Iterator");
        ListToIterator listToIterator = new ListToIterator(list);
        while(listToIterator.hasNext()){
            System.out.println(listToIterator.next());
        }
    }

}
