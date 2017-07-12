package com.patterns.iterator;


import org.junit.Test;

import java.util.*;

public class IteratorTest {

    @Test
    public void testArrayToIterator (){
        String [] list = {"Array", "To", "Iterator"};
        ArrayToIterator arrayToIterator = new ArrayToIterator(list);
        printElemnts(arrayToIterator);
    }

    @Test
    public void testListToIterator (){
        List<String> list = Arrays.asList("List", "To", "Iterator");
        ListToIterator listToIterator = new ListToIterator(list);
        printElemnts(listToIterator);
    }

    @Test
    public void testMapToIterator (){
        Map map = new HashMap();
        map.put("0", "Map");
        map.put("1", "To");
        map.put("2", "Iterator");
        MapToIterator mapToIterator = new MapToIterator(map);
        printElemnts(mapToIterator);
    }

    private void printElemnts(Iterator iterator){
        System.out.println("");
        System.out.println("-------------------------------------------");
        System.out.println(iterator.getClass().getName());
        System.out.println("-------------------------------------------");
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

}
