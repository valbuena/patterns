package com.patterns.proxy.virtual;

import org.junit.Test;

public class ImageTest {

    @Test
    public void testImageIsPainted(){

        ImageProxy proxy =  new ImageProxy();
        proxy.paint();
    }
}
