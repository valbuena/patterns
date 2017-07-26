package com.patterns.proxy.virtual;

public class ImageProxy implements Image {

    ImageReal imageReal = null;

    @Override
    public void paint() {
        if (this.imageReal == null){
            System.out.println("**** LOADING ....");
            this.imageReal = new ImageReal();
        }
        imageReal.paint();
    }
}