package com.patterns.proxy.protection;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class HotelTest {

    @Test
    public void testHotelOwnerSetNameAccess()throws IllegalAccessException {
        Hotel hotel = getHotelOwner();
        hotel.setName("Palace");
        Assert.assertEquals("Palace", hotel.getName());
    }

    @Test(expected = IllegalAccessException.class)
    public void testHotelOwnerSetPointsAccess() throws IllegalAccessException {
        Hotel hotel = getHotelOwner();
        hotel.setPoints(2);
    }

    @Test
    public void testHotelOwnerGetRatingAccess(){
        Hotel hotel = getHotelOwner();
        Assert.assertEquals(0, hotel.getRating());
    }


    @Test(expected = IllegalAccessException.class)
    public void testHotelGuestSetNameAccess() throws IllegalAccessException {
        Hotel hotel = getHotelGuest();
        hotel.setName("Palace");
    }

    @Test
    public void testHotelGuestSetPointsAccess() throws IllegalAccessException {
        Hotel hotel = getHotelGuest();
        hotel.setPoints(2);
        Assert.assertEquals(2, hotel.getRating());
    }

    @Test
    public void testHotelGuestGetRatingAccess(){
        Hotel hotel = getHotelGuest();
        Assert.assertEquals(0, hotel.getRating());
    }



    private Hotel getHotelOwner (){
        Hotel hotel = new HotelReal();
        return getHotelWithHandler (
                hotel,
                new HotelOwnerHandle(hotel)
        );
    }

    private Hotel  getHotelGuest(){
        Hotel hotel = new HotelReal();
        return getHotelWithHandler (
                hotel,
                new HotelGuestHandle(hotel)
        );
    }

    private Hotel getHotelWithHandler (Hotel hotel, InvocationHandler handler){
        return (Hotel) Proxy.newProxyInstance(
                hotel.getClass().getClassLoader(),
                hotel.getClass().getInterfaces(),
                handler
        );
    }

}
