package com.patterns.proxy.protection;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class HotelOwnerHandle implements InvocationHandler {

    Hotel hotel;

    public HotelOwnerHandle(Hotel hotel) {
        this.hotel = hotel;
    }

    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws IllegalAccessException, InvocationTargetException {
        if (isAvailableMethod(method))
        {
            throw new IllegalAccessException();
        }
        else return method.invoke(hotel, objects);
    }

    private boolean isAvailableMethod (Method method){
        return  (method.getName().equals("setPoints"));
    }
}
