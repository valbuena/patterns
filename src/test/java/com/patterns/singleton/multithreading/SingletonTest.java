package com.patterns.singleton.multithreading;

import com.patterns.singleton.multithreading.Singleton;
import org.junit.Test;

/**
 * Created by pep on 13/03/16.
 */
public class SingletonTest {

 @Test
 public void testSingleton(){
     Singleton.getSingleton();
     Singleton.getSingleton();
 }

}
