package com.patterns.proxy.protection;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class HotelGuestHandle implements InvocationHandler {

    Hotel hotel;

    public HotelGuestHandle(Hotel hotel) {
        this.hotel = hotel;
    }

    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws IllegalAccessException, InvocationTargetException {
        if (isAvailableMethod(method)) {
            return method.invoke(hotel, objects);
        }
        else throw new IllegalAccessException();
    }

    private boolean isAvailableMethod (Method method){
       return  (method.getName().equals("setPoints")
               || method.getName().startsWith("get"));
    }

}
