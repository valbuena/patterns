package com.patterns.proxy.virtual;

public class ImageReal implements Image {
    @Override
    public void paint() {
        System.out.println("**** I am being painted");
    }
}
